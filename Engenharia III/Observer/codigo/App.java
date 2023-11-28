import java.util.ArrayList;
import java.util.List;

public class App {
    private List<Observer> observers = new ArrayList<>();

    public void addUser(Observer observer) {
        observers.add(observer);
    }

    public void removeUser(Observer observer) {
        observers.remove(observer);
    }

    public void sendMessage(String message) {
        notifyObservers(message);
    }

    private void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}