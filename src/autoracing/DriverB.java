package autoracing;

public class DriverB extends Driver<PassengerCars> {
    public DriverB(String fullName, int drivingExperience, PassengerCars car) {
        super(fullName, true, "B", drivingExperience, car);
    }
}
