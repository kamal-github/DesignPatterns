public abstract class SelfDrivingVehicle {
    // Template method representing the common functionality
    // as a Generalized method abstracted into a abstract class
    // and the specialized implementation is in the subclasses.
    public final void driveToDestination(String dest) {
        start();
        accelerate();
        drive();
        applyBreak();
    }

    abstract void start();

    abstract void accelerate();

    abstract void drive();

    abstract void applyBreak();
}
