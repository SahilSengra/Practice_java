package Interface_java;

public class audi implements Icar {
    private boolean engineon;
    private String yearofBuikt;

    public audi(boolean engineon, String yearofBuikt) {
        this.engineon = engineon;
        this.yearofBuikt = yearofBuikt;
    }

    @Override
    public void noOfWheels() {
        System.out.println(" It has 4 wheel");
    }

    @Override
    public void engineOnOff() {
        if(engineon = true){
            System.out.println("engine is now on");
        }else
            System.out.println("engine is off");

    }

    @Override
    public void seatQuality() {
        System.out.println("it has black engineer seat");
    }

    @Override
    public void steeringWheel() {
        System.out.println("gol");
    }

    @Override
    public void fuelTankSize() {

    }


}
