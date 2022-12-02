package autoracing;

public class Bus extends Car implements Competing {
    private BodyType capacity;
    public Bus(String brand, String model, double engineCapacity, BodyType capacity) {
        super(brand, model, engineCapacity );
        this.capacity = capacity;
    }

    public enum BodyType {
        ESPECIALLY_SMALL(0, 10),
        SMALL(10, 25),
        AVERAGE(40, 50),
        BIG(60, 80),
        ESPECIALLY_BIG(100, 120);

        private final int capacityFrom;
        private final int capacityTo;

        public int getCapacityFrom() {
            return capacityFrom;
        }

        public int getCapacityTo() {
            return capacityTo;
        }
        BodyType(int capacityFrom, int capacityTo) {
            this.capacityFrom = capacityFrom;
            this.capacityTo = capacityTo;}

        public int getCapacityBus(int capacityFrom, int capacityTo) {
            return capacityFrom + capacityTo;
        }

        public String toString () {
            return (" " +"Вместимость от " + capacityFrom + " , до " + capacityTo + " мест." );
        }


    }
    public void startMoving() {
        System.out.println("Выезжает с автопарка");
    }

    public void finishTheMovement() {
        System.out.println("Отправляется в автопарк");

    }

    public String toString() {
        return super.toString() + capacity;
    }

    public BodyType getCapacity() {
        return capacity;
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
