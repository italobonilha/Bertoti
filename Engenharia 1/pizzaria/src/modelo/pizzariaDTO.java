/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author bonilha
 */
public class pizzariaDTO {
    private int id;
    private String sabor, quantidade, bebida, valor;
    
    public String getSabor(){
        return sabor;
    }
    
    public void setSabor (String sabor){
        this.sabor = sabor;
    }
    
    public String getQuantidade(){
        return quantidade;
    }
    
    public void setQuantidade (String quantidade){
        this.quantidade = quantidade;
    }
    
    public String getBebida(){
        return bebida;
    }
    
    public void setBebida (String bebida){
        this.bebida = bebida;
    }
    
    public String getValor(){
        return valor;
    } 
    
    public void setValor (String valor){
        this.valor = valor;
    }
   
    public int getId(){
        return id;
    }
    
    public void setId (int id) {
        this.id = id;
    }
}
