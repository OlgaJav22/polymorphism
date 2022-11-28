package autoracing;

public class Trucks extends Car implements Competing{
    public Trucks(String brand, String model, double engineCapacity) {
        super(brand, model, engineCapacity);
    }

    public void startMoving() {
        System.out.println("Выезжает со специально обустроенной паркови");
    }

    public void finishTheMovement() {
        System.out.println("Паркуется в специально отведенном месте");

    }

    public String toString() {
        return super.toString();
    }

    public String getPitStop() {
        System.out.println("Время осмотра и выявление повреждений");
        return "перерыв на 40 минут";
    }

    public void getBestLapTime() {
        System.out.println("Выявление лучшего времени");
    }

    public void getMaxSpeed() {
        System.out.println("Объявление результатов и максимальной скорости");

    }
}
