import java.util.ArrayList;
import java.util.List;

public abstract class Oficina implements Subject {
    private List<Funcionario> funcionarios;
    private List<Observer> observers;

    public Oficina() {
        this.funcionarios = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void registrarObserver(Observer observador){
        this.observers.add(observador);
    }

    public void notificarUltimoPedido(List<Funcionario> l){
        this.observers.forEach(ob -> ob.atualizar(l));
    }

    public void adicionarFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public Funcionario retirarFuncionario(String nomeFuncionario){
        return this.funcionarios.stream().filter(r -> r.getNome().equalsIgnoreCase(nomeFuncionario)).findFirst().orElse(null);
    }
}