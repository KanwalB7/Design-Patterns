// Builder Pattern separates the construction of a complex object from its representation.

class Product {
    private String part1;
    private String part2;

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public void display() {
        System.out.println("Part 1: " + part1 + ", Part 2: " + part2);
    }
}

interface Builder {
    void buildPart1();

    void buildPart2();

    Product getResult();
}

class ConcreteBuilder implements Builder {
    private Product product = new Product();

    public void buildPart1() {
        product.setPart1("Builder Part 1");
    }

    public void buildPart2() {
        product.setPart2("Builder Part 2");
    }

    public Product getResult() {
        return product;
    }
}


class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        builder.buildPart1();
        builder.buildPart2();
        return builder.getResult();
    }
}

public class BuilderPattern{
        public static void main(String [] args){


            // Example usage:
            Builder builder = new ConcreteBuilder();
            Director director = new Director(builder);
            Product product = director.construct();
            product.display();

        }

}


