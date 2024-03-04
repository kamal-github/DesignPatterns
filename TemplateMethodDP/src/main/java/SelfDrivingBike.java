public class SelfDrivingBike extends SelfDrivingVehicle {

    @Override
    void start() {
        System.out.println("start bike");
    }

    @Override
    void accelerate() {
        System.out.println("accelerate bike");
    }

    @Override
    void drive() {
        System.out.println("drive bike");
    }

    @Override
    void applyBreak() {
        System.out.println("break bike");
    }
}
