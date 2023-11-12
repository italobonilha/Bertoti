public class Medicamento implements EstabelecimentoSaude {
    private String nome;
    private double preco;

    public Medicamento(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void informacoesEstabelecimentoSaude() {
        System.out.println("Medicamento: Nome - " + nome + ", Preço - " + preco);
    }


    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
