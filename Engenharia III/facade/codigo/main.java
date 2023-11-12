public class Main {
    public static void main(String[] args) {
        FarmaciaFacade farmacia = new FarmaciaFacade();
        String cliente = "Maria";
        String[] medicamentos = { "MedicamentoX", "MedicamentoY" };

        farmacia.realizarVenda(cliente, medicamentos);
    }
}
