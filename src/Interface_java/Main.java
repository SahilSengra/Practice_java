package Interface_java;

public class Main {
    public static void main(String[] args) {
        Icar mynewCar;
        mynewCar = new audi(false,"2020");
        mynewCar.engineOnOff();
        mynewCar.seatQuality();

        mynewCar = new Merc(false, "2022");
        mynewCar.engineOnOff();
    }
}
