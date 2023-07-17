package Interface_java;

public class Merc implements Icar {

    private boolean engineon;
    private String yearofBuikt;

    public Merc(boolean engineon, String yearofBuikt) {
        this.engineon = engineon;
        this.yearofBuikt = yearofBuikt;
    }

    @Override
    public void noOfWheels() {

    }

    @Override
    public void engineOnOff() {
        if(engineon = true){
            System.out.println("engine is now on for merc");
        }else
            System.out.println("engine is off for merc");
    }

    @Override
    public void seatQuality() {

    }

    @Override
    public void steeringWheel() {

    }

    @Override
    public void fuelTankSize() {

    }
}
