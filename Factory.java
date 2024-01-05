// Factory Pattern defines an interface for creating objects, but leaves the choice of their type to the subclasses.

interface Product {
    void displayInfo();
}

class ConcreteProductA implements Product {
    public void displayInfo() {
        System.out.println("Product A");
    }
}

class ConcreteProductB implements Product {
    public void displayInfo() {
        System.out.println("Product B");
    }
}

interface ProductFactory {
    Product createProduct();
}

class ConcreteFactoryA implements ProductFactory {
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

class ConcreteFactoryB implements ProductFactory {
    public Product createProduct() {
        return new ConcreteProductB();
    }
}


public class Factory{
    public static void main(String [] args){
        

        //Example Usage
        ProductFactory factory = new ConcreteFactoryA();
        Product product = factory.createProduct();
        product.displayInfo();

    }

}