// Implement a Base class with a final method showDetails() extends the Base class to a Derived class and try to override the showDetails() method to observe the result.

import java.util.*;

// Base class with a final method
class Base {
    // Final method cannot be overridden by subclasses
    public final void showDetails() {
        System.out.println("This is a final method from the Base class.");
    }
}

// Derived class attempting to override the final method from the Base class
class Derived extends Base {
    // This method would cause a compile-time error if uncommented
    // @Override
    // public void showDetails() {
    // System.out.println("Trying to override a final method.");
    // }
}

public class slip1 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Derived derived = new Derived();
        derived.showDetails(); // This calls the Base class's showDetails method
    }
}
