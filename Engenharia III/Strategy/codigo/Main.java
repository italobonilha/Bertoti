public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra(new SemDesconto());

        double valorOriginal = 100.0;

        System.out.println("Valor original: " + valorOriginal);
        System.out.println("Valor com desconto: " + compra.calcularValorComDesconto(valorOriginal));

        // Atualiza o valor original após o primeiro desconto de 10%
        valorOriginal = compra.calcularValorComDesconto(valorOriginal);

        compra.setEstrategiaDesconto(new Desconto10());
        System.out.println("Valor com desconto: " + compra.calcularValorComDesconto(valorOriginal));
    }
}
