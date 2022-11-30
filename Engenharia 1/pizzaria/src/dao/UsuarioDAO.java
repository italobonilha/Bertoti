/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import modelo.Login;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import modelo.pizzariaDTO;

/**
 *
 * @author bonilha
 */
public class UsuarioDAO{
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<pizzariaDTO> lista = new ArrayList<>();
    
    
    public ResultSet autenticacaoUsuario(Login pzzlogin)  {
        conn = new ConnectionFactory().getConnection();
        
        try {
            String sql = "select * from administrador where senha = ? and usuario = ?";
            
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, pzzlogin.getSenha());
            pstm.setString(2, pzzlogin.getUsuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
    }    
    
    public void cadastrarPizzaria (pizarriaDTO pzzDTO) {
        
        String sql = "INSERT INTO produtos (sabor , quantidade, bebida, valor )" + "VALUES (?, ?, ?, ?, ?)";
        
        conn = new ConnectionFactory().getConnection();
        
        try {
            
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setString(1, pzzDTO.getSabor());
            pstm.setString(2, pzzDTO.getQuantidade());
            pstm.setString(3, pzzDTO.getBebida());
            pstm.setString(4, pzzDTO.getValor());
            
            pstm.execute();
            pstm.close();
            
        }   catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "cadastrarPizzaria" + erro);
        }
    }
    
    
    
    
    public ArrayList<pizzariaDTO> listarCanais() {
        
        String sql = "select * from produtos ";
        conn = new ConnectionFactory().getConnection();
        
        try{
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                pizzariaDTO objpzzDTO = new pizzariaDTO();
                objpzzDTO.setId(rs.getInt("id"));
                objpzzDTO.setSabor(rs.getString("sabor"));
                objpzzDTO.setQuantidade(rs.getString("quantidade"));
                objpzzDTO.setBebida(rs.getString("bebida"));
                objpzzDTO.setValor(rs.getString("valor"));

                lista.add(objpzzDTO);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "CanaisDAO" + erro);
        }
        return lista;
    }
    
 public void excluirCadastros(pizzariaDTO objpzzDTO){
     String sql = "delete from produtos where id = ? ";
     conn = new ConnectionFactory().getConnection();
     
     try {

            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, objpzzDTO.getId());

            pstm.execute();
            pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "cadastrarCanal" + erro);
        }

    }
 
 public void alterarCadastro(pizzariaDTO objpzzDTO){
    String sql = "UPDATE produtos SET sabor = ?, quantidade = ?, bebida = ?, valor = ? WHERE id = ?";    
   
    conn = new ConnectionFactory().getConnection();
    
    
      try {

           pstm = (PreparedStatement) conn.prepareStatement(sql);
           pstm.setString(1, objpzzDTO.getSabor());
           pstm.setString(2, objpzzDTO.getQuantidade());
           pstm.setString(3, objpzzDTO.getBebida());
           pstm.setString(4, objpzzDTO.getValor());
           pstm.setInt(6, objpzzDTO.getId());
            

           pstm.execute();
           pstm.close();

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "AlterarProduto" + erro);
        }
 
 }
 
 public Vector  pesquisar(String pesq) throws Exception {
     Vector  tb = new Vector ();
     
     conn = new ConnectionFactory().getConnection();
     String sql = "select * from produtos where sabor like '" + pesq + "%'";
     PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
     
     
     ResultSet rs = ps.executeQuery();
     while(rs.next()){
         Vector nl = new Vector();
         nl.add(rs.getInt("id"));
         nl.add(rs.getString("sabor"));
         nl.add(rs.getString("quantidade"));
         nl.add(rs.getString("bebida"));
         nl.add(rs.getString("valor"));
         
         tb.add(nl);
         
     }
     return tb;
 }
 }
    
    
