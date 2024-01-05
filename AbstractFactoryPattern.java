// Abstract Factory Pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.

interface AbstractProductA {
    void displayInfo();
}

interface AbstractProductB {
    void displayInfo();
}

class ConcreteProductA1 implements AbstractProductA {
    public void displayInfo() {
        System.out.println("Product A1");
    }
}

class ConcreteProductA2 implements AbstractProductA {
    public void displayInfo() {
        System.out.println("Product A2");
    }
}

class ConcreteProductB1 implements AbstractProductB {
    public void displayInfo() {
        System.out.println("Product B1");
    }
}

class ConcreteProductB2 implements AbstractProductB {
    public void displayInfo() {
        System.out.println("Product B2");
    }
}

interface AbstractFactory {
    AbstractProductA createProductA();

    AbstractProductB createProductB();
}

class ConcreteFactory1 implements AbstractFactory {
    public AbstractProductA createProductA() {
        return new ConcreteProductA1();
    }

    public AbstractProductB createProductB() {
        return new ConcreteProductB1();
    }
}

class ConcreteFactory2 implements AbstractFactory {
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}




public class AbstractFactoryPattern{
        public static void main(String [] args){


           
        // Example usage:
        AbstractFactory factory1 = new ConcreteFactory1();
        AbstractProductA productA = factory1.createProductA();
        productA.displayInfo();
        AbstractProductB productB = factory1.createProductB();
        productB.displayInfo();


        }
}