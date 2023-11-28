public class Desconto10 implements Modelodesc {
    @Override
    public double calcularDesconto(double valor) {
        return valor * 0.9;
    }
}