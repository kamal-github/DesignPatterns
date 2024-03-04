public class TemplateMethodMain {
    public static void main(String[] args) {
        SelfDrivingVehicle car = new SelfDrivingCar();
        SelfDrivingVehicle bike = new SelfDrivingBike();
        car.driveToDestination("Indore");
        System.out.println("----------------------");
        bike.driveToDestination("Bhopal");
    }
}

