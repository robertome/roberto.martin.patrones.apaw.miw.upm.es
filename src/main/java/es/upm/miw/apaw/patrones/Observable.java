package es.upm.miw.apaw.patrones;

import java.util.HashSet;
import java.util.Set;

public class Observable<T> {

    private Set<Observer<T>> observers = new HashSet<Observer<T>>();

    public void addObserver(Observer observador) {
        this.observers.add(observador);
    }

    public void removeObserver(Observer observador) {
        this.observers.remove(observador);
    }

    public void notifyObservers(T obj) {
        for (Observer<T> observer : observers) {
            observer.update(obj);
        }
    }

}