public class AdapterMain {
    // Here's a step-by-step plan to implement the Adapter pattern:
    //Define an interface Target that the client expects to use.
    //Create a class Adaptee that has some useful behavior, but its interface isn't compatible with the Target interface.
    //Create an Adapter class that can map the Target interface to the Adaptee class.
    //The Adapter class implements the Target interface and has a reference to an object of the Adaptee class.
    //The Adapter class delegates the requests it receives to the Adaptee object

    public static void main(String[] args) {
        // Step 5: Use the AlienAdapter in the client code
        Alien alien = new Alien();
        Character character = new AlienAdapter(alien);
        character.attack();
    }
}
