public class Estoque {
    private List<Medicamento> produtos;
    private Map<Medicamento, Integer> quantidades;
    private Map<Medicamento, Date> datasValidade;
    private Map<Medicamento, Fornecedor> fornecedores;
    private Map<Medicamento, String> localizacao;

    public boolean verificar(String nomeMedicamento) {
        for (Medicamento medicamento : produtos) {
            if (medicamento.getNome().equalsIgnoreCase(nomeMedicamento) && quantidades.getOrDefault(medicamento, 0) > 0) {
                return true;
            }
        }
        return false;
    }
}
