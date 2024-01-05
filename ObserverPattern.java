// Observer Pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

import java.util.ArrayList;
import java.util.List;

// Subject (Observable)
class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

// Observer
interface Observer {
    void update();
}

// Concrete Observer
class ConcreteObserver implements Observer {
    public void update() {
        System.out.println("Observer Updated");
    }
}

public class ObserverPattern{
        public static void main(String [] args){

            // Example usage:
            Subject subject = new Subject();
            Observer observer = new ConcreteObserver();
            subject.addObserver(observer);
            subject.notifyObservers();


        }
}

