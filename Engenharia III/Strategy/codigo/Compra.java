public class Compra {
    private Modelodesc estrategiaDesconto;

    public Compra(Modelodesc estrategiaDesconto) {
        this.estrategiaDesconto = estrategiaDesconto;
    }

    public void setEstrategiaDesconto(Modelodesc estrategiaDesconto) {
        this.estrategiaDesconto = estrategiaDesconto;
    }

    public double calcularValorComDesconto(double valor) {
        return estrategiaDesconto.calcularDesconto(valor);
    }
}