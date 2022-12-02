package autoracing;

public class PassengerCars extends Car implements Competing {
    private BodyType namingBodyType;
    public PassengerCars(String brand, String model, double engineCapacity, BodyType namingBodyType) {
        super(brand, model, engineCapacity);
        this.namingBodyType = namingBodyType;
    }


    public enum BodyType {
        CD_N("Седан"),
        XCH_BK("Хетчбек"),
        KY_PE("Купе"),
        UN_SAL("Универсал"),
        VN_IK("Внедорожник"),
        KR_VER("Кроссовер"),
        PIK_P("Пикап"),
        FUR_N("Фургон"),
        MIN_VN("Минивен");
        private final String namingBodyType;

        BodyType(String namingBodyType) {
            this.namingBodyType = namingBodyType;
        }

        public String getNamingBodyType() {
            return namingBodyType;
        }

        public String [] getNameBodyType () {
            String[] type = new String[BodyType.values().length];
            for (int i = 0; i < type.length;  i++) {
                type[i] = BodyType.values()[i].name();
            }
            return type;
        }
        public String toString () {
            return "\t" + " Тип кузова: " + namingBodyType;
        }
    }

    public void startMoving() {
        System.out.println("Выезжает c придомовой терртитории");
    }

    public void finishTheMovement() {
        System.out.println("Паркуется возле дома");

    }

    public BodyType getNamingBodyType() {
        return namingBodyType;
    }
    public String toString() {
        return super.toString() + namingBodyType;
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
