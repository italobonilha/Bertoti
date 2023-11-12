public class Farmacia implements EstabelecimentoSaude {
    private List<Medicamento> medicamentos = new ArrayList<>();

    public void adicionarMedicamento(Medicamento medicamento) {
        medicamentos.add(medicamento);
    }

    public void removerMedicamento(Medicamento medicamento) {
        medicamentos.remove(medicamento);
    }

    public void informacoesEstabelecimentoSaude() {
        System.out.println("Informações da Farmácia:");
        System.out.println("Medicamentos disponíveis:");
        for (Medicamento medicamento : medicamentos) {
            System.out.println("Nome: " + medicamento.getNome() + ", Preço: " + medicamento.getPreco());
        }
    }
}
