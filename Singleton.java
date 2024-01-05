// Singleton Pattern ensures a class has only one instance and provides a global point to this instance.

public class Singleton {

        // The field for storing the singleton instance should be
    // declared static.
    private static Singleton instance;

    private Singleton() {}   // The singleton's constructor should always be private to
                             // prevent direct construction calls with the `new`


    // The static method that controls access to the singleton
    // instance.
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
