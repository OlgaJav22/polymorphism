package autoracing;

public class Driver<V extends Car> implements CategoryC, CategoryD, CategoryB {

    private String fullName;
    private boolean validDriversLicense;
    private int experience;
    public static final String LICENSE_BE = "есть";
    private String category;
    private final V car;

    public Driver(String fullName, boolean validDriversLicense, String category, int experience, V car) {
        setFullName(fullName);
        this.validDriversLicense = validDriversLicense;
        this.category = category;
        this.experience = experience;
        this.car = car;
    }

    public void startMoving() {
        System.out.println("Пристегните ремени и поехали");

    }

    public void stop() {
        System.out.println("Поездка окончена");

    }

    public void refuelTheCar() {
        System.out.println("Необходимо заправиться");

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName != null && !fullName.isBlank() && !fullName.isEmpty()) {
            this.fullName = fullName;
        } else {
            this.fullName = "не указано";
        }
    }

    public boolean isValidDriversLicense(String licens) {
        if (licens != null && !licens.isEmpty() && !licens.isBlank()) {
            return true;
        } else {
            return false;
        }
    }

    public String getCategory() {
        return category;
    }

    public int getExperience() {
        if (experience > 3) {
            this.experience = experience;
        } else {
            System.out.println("Вы нам не подходите");
        }
        return experience;
    }

    public void setExperience(int experience) {
        if (experience > 3) {
            this.experience = experience;
        }
    }

    public String toString() {
        return "ФИО: " + getFullName() + "; наличие прав - " + isValidDriversLicense(LICENSE_BE) + "; стаж: " + getExperience() + "лет."
                + "\t"
                + "Водитель - " + getFullName() + " управляет автомобилем " + this.car.getBrand() + this.car.getModel() + " и будет участвовать в заезде";
    }


    @Override
    public void drivingAcar(Trucks trucks) {
        System.out.println("Водитель " + getFullName());
        startMoving();
    }

    @Override
    public void drivingAcar(Bus bus) {
        System.out.println("Водитель " + getFullName());
        startMoving();
    }

    @Override
    public void drivingAcar(PassengerCars cars) {
        System.out.println("Водитель " + getFullName());
        startMoving();
        System.out.println("Вы участвуете в заезде!");

    }

    public String printif (V car) {
        System.out.println(" за Вами закреплена машина - " + car.getBrand()+ " " + car.getModel());
        return null;
    }
}
