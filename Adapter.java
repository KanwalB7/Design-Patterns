// Adapter Pattern allows the interface of an existing class to be used as another interface.

interface Target {
    void request();
}

class Adaptee {
    void specificRequest() {
        System.out.println("Specific Request");
    }
}

public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }

        public static void main(String [] args){

            // Example usage:
            Target target = new Adapter(new Adaptee());
            target.request();
            
        }



}

