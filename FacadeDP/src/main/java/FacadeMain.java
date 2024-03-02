class FacadeMain {
    public static void main(String []args) {
        // The Facade Design Pattern decouples or separates the client
        // from all of the sub components

        // The Facades aim is to simplify interfaces so you don't have
        // to worry about what is going on under the hood

        // This pattern involves a single wrapper class which contains a
        // set of members required by client. These members access the system
        // on behalf of the facade client and hide the implementation details.

        // You can think of it as a way to provide a simple interface to a
        // complex subsystem. This reduces the learning curve necessary to
        // successfully leverage the subsystem.

        // The Facade Pattern can be used in any of the following situations

        // 1. When you want to provide a simple interface to a complex subsystem
        // 2. When there are many dependencies between clients and the implementation
        // 3. When you want to structure a subsystem into layers

        // The Facade Pattern provides a unified interface to a set of interfaces
        // in a subsystem. The Facade defines a higher-level interface that makes
        // the subsystem easier to use.

        // In this example we have a DwarvenGoldmineFacade that provides a simple
        // interface to the complex goldmine subsystem.

        DwarvenGoldmineFacade facade = new DwarvenGoldmineFacade();
        facade.startNewDay();
        facade.digOutGold();
        facade.endDay();
    }
}