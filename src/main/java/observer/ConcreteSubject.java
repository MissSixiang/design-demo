package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 主题
 * @author: yianmou
 **/
public class ConcreteSubject implements Subject {

    private List<Observer> observers;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        observers.forEach(observer -> observer.update());
    }
}
