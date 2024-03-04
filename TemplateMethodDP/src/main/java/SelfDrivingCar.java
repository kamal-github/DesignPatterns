public class SelfDrivingCar extends SelfDrivingVehicle {

    @Override
    void start() {
        System.out.println("start car");
    }

    @Override
    void accelerate() {
        System.out.println("accelerate car");
    }

    @Override
    void drive() {
        System.out.println("drive car");
    }

    @Override
    void applyBreak() {
        System.out.println("break car");
    }
}
