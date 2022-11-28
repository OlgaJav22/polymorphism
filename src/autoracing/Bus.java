package autoracing;

public class Bus extends Car implements Competing {
    public Bus(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    public void startMoving() {
        System.out.println("Выезжает с автопарка");
    }

    public void finishTheMovement() {
        System.out.println("Отправляется в автопарк");

    }

    public String toString() {
        return super.toString();
    }

    public String getPitStop() {
        System.out.println("Время замены всех шин");
        return "перерыв на 30 минут";
    }

    public void getBestLapTime() {
        System.out.println("Подведение итогов соревнований, объявление лучшего времени");
    }

    public void getMaxSpeed() {
        System.out.println("Объявление максимальной скорости");

    }
}
