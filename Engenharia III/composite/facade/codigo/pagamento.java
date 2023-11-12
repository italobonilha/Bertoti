public class Pagamento {
    public void efetuarPagamento() {
        System.out.println("Processando pagamento...");

        boolean pagamentoAprovado = realizarProcessamentoPagamento();

        if (pagamentoAprovado) {
            System.out.println("Pagamento aprovado. Transação concluída com sucesso.");
        } else {
            System.out.println("Falha no pagamento. Transação cancelada.");
        }
    }

    private boolean realizarProcessamentoPagamento() {
        
        return Math.random() < 0.9;
    }
}
