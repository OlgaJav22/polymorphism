package autoracing;

public class PassengerCars extends Car implements Competing {
    public PassengerCars(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    public void startMoving() {
        System.out.println("Выезжает c придомовой терртитории");
    }

    public void finishTheMovement() {
        System.out.println("Паркуется возле дома");

    }

    public String toString() {
        return super.toString();
    }

    public String getPitStop() {
        System.out.println("Время замены всех шин");
        return "перерыв на 25 минут";
    }

    public void getBestLapTime() {
        System.out.println("Подведение итогов, подсчет лучшего времени");
    }

    public void getMaxSpeed() {
        System.out.println("Объявление максимальной скорости среди всех участников");

    }

}
