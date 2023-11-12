public class Main {
    public static void main(String[] args) {
        Medicamento medicamento1 = new Medicamento("Paracetamol", 10.5);
        Medicamento medicamento2 = new Medicamento("Aspirina", 8.0);

        Farmacia farmacia = new Farmacia();
        farmacia.adicionarMedicamento(medicamento1);
        farmacia.adicionarMedicamento(medicamento2);

        farmacia.informacoesEstabelecimentoSaude();

        farmacia.removerMedicamento(medicamento1);
        farmacia.informacoesEstabelecimentoSaude();
    }
}
