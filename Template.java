// Template Method Pattern defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

abstract class AbstractClass {
    // Template method with steps defined
    public final void templateMethod() {
        step1();
        step2();
        step3();
    }

    // Steps to be implemented by subclasses
    abstract void step1();

    abstract void step2();

    abstract void step3();
}

class ConcreteClass extends AbstractClass {
    void step1() {
        System.out.println("Step 1");
    }

    void step2() {
        System.out.println("Step 2");
    }

    void step3() {
        System.out.println("Step 3");
    }
}



public class Template{
        public static void main(String [] args){
            
            // Example usage:
            AbstractClass template = new ConcreteClass();
            template.templateMethod();


        }

}