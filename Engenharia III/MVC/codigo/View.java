import java.util.List;

public abstract class View implements Observer {
    private Servico ultServico;
    private List<Funcionario> funcionarios;

    public void setUltServico(Servico pedido){
        this.ultServico = pedido;
    }

    public void atualizar(List<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
    }
}