public class FarmaciaFacade {
    private Venda venda;
    private Estoque estoque;

    public FarmaciaFacade() {
        venda = new Venda();
        estoque = new Estoque();
    }

    public void venderMedicamento(String nomeMedicamento, String nomeCliente) {
        System.out.println("Realizando venda do medicamento: " + nomeMedicamento + " para o cliente: " + nomeCliente);
        if (estoque.verificar(nomeMedicamento)) {
            // Lógica para processar pagamento
            Medicamento medicamento = buscarMedicamento(nomeMedicamento);
            System.out.println("Medicamento encontrado: " + medicamento.getNome());
            venda.efetuar(medicamento, nomeCliente);
            System.out.println("Venda concluída.");
        } else {
            System.out.println("Medicamento não encontrado na farmácia ou estoque insuficiente.");
        }
    }

    private Medicamento buscarMedicamento(String nomeMedicamento) {
        return new Medicamento();
    }

    public static void main(String[] args) {
        FarmaciaFacade farmacia = new FarmaciaFacade();
        farmacia.venderMedicamento("Paracetamol", "João");
    }
}