import java.util.List;

public interface Subject {
    void registrarObserver(Observer o);
    void notificarObservers(List<Funcionario> funcionarios);
}