// Bridge Pattern separates abstraction from implementation so that the two can vary independently.

interface Implementor {
    void operationImpl();
}

class ConcreteImplementorA implements Implementor {
    public void operationImpl() {
        System.out.println("Concrete Implementor A");
    }
}

class ConcreteImplementorB implements Implementor {
    public void operationImpl() {
        System.out.println("Concrete Implementor B");
    }
}

abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }

    abstract void operation();
}

class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void operation() {
        implementor.operationImpl();
    }
}

public class Bridge{
        public static void main(String [] args){

            // Example usage:
            Implementor implementorA = new ConcreteImplementorA();
            Abstraction abstractionA = new RefinedAbstraction(implementorA);
            abstractionA.operation();
            Implementor implementorB = new ConcreteImplementorB();
            Abstraction abstractionB = new RefinedAbstraction(implementorB);
            abstractionB.operation();

        }
}

