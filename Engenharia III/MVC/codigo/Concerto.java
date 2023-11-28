public abstract class Concerto implements Servico {
    private View view;
    private Oficina oficina;

    public void setVisualizador(View view){
        this.view = view;
    }

    public void anotarOrdemdeservico(){
        System.out.println("Ordem de serviço registrada!");
    }
}
