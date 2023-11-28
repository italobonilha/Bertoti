public class Funcionario {
    private String nome;
    private double saldo;
    private String cargo;

    public Funcionario(String nome, double saldo, String cargo){
        this.nome = nome;
        this.saldo = saldo;
        this.cargo = cargo;
    }

    public String getNome(){
        return this.nome;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getCargo(){
        return this.cargo;
    }
}
