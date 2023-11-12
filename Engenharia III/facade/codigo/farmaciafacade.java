public class FarmaciaFacade {
    private Venda venda;
    private EstoqueMedicamentos estoque;
    private ProcessadorPagamento processadorPagamento;

    public FarmaciaFacade() {
        venda = new Venda();
        estoque = new EstoqueMedicamentos();
        processadorPagamento = new ProcessadorPagamento();
    }

    public void realizarVenda(String cliente, String[] medicamentos) {
        System.out.println("Realizando venda para o cliente: " + cliente);
        venda.iniciarVenda();
        estoque.verificarEstoque();
        double total = calcularTotalCompra(medicamentos);
        processarPagamento(cliente, total);
        System.out.println("Venda concluída.");
    }

    private double calcularTotalCompra(String[] medicamentos) {
        double total = 0.0;
        return total;
    }

    private void processarPagamento(String cliente, double valor) {
        System.out.println("Processando pagamento de R$" + valor + " para o cliente " + cliente);
        processadorPagamento.efetuarPagamento();
        System.out.println("Pagamento processado.");
    }
}
