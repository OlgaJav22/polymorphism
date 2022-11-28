import autoracing.Bus;
import autoracing.Driver;
import autoracing.PassengerCars;
import autoracing.Trucks;

public class Main {
    public static void main(String[] args) {
        Bus daewoo = new Bus("DAEWOO", "BS090", 4.8);
        Bus isuzu = new Bus("ISUZU", "А-092Н6", 5.9);
        Bus mercedes = new Bus("MERCEDES", "Conecto G", 5.0);
        Bus gazel = new Bus("Газель", "ГАЗ-560", 3.9);

        isuzu.startMoving();
        mercedes.getPitStop();
        System.out.println(daewoo);
        System.out.println(isuzu);
        System.out.println(mercedes);
        System.out.println(gazel);
        System.out.println("\n");

        PassengerCars lada = new PassengerCars("Lada", "Granta", 2.9);
        PassengerCars audi = new PassengerCars("Audi", "A8 50L TDI quattro", 3.9);
        PassengerCars bmw = new PassengerCars("BMW", "Z8", 4.0);
        PassengerCars kia = new PassengerCars("Kia", "Sportage", 2.9);

        audi.startMoving();
        bmw.getBestLapTime();
        System.out.println(lada);
        System.out.println(audi);
        System.out.println(bmw);
        System.out.println(kia);
        System.out.println("\n");

        Trucks kamaz = new Trucks("Kamaz", "МАЗ-5432", 11.97);
        Trucks jac = new Trucks("JAC", "Sunrai", 7.9);
        Trucks man = new Trucks("MAN", "TGS", 15.9);
        Trucks hyundai = new Trucks("Hyundai", "Mighty", 3.9);

        man.startMoving();
        kamaz.getMaxSpeed();
        System.out.println(kamaz);
        System.out.println(jac);
        System.out.println(man);
        System.out.println(hyundai);
        System.out.println("\n");

        Driver vasya = new Driver("Сажин Василий Михайлович", true, 12);
        Driver petya = new Driver("Григорьев Петр Иванович", true, 7);
        Driver roman = new Driver("Носов Роман Евгеньевич", true, 2);
        System.out.println(vasya);
        System.out.println(petya);
        System.out.println(roman);
        System.out.println(vasya.isValidDriversLicense("есть"));

        Driver<Trucks> oleg = new Driver<>("Олег", true, 7);
        oleg.drivingAcar(jac);

        vasya.drivingAcar(audi);
        vasya.printif(audi);

    }
}