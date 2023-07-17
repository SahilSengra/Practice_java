import java.util.Scanner;

public class weight_converter {
    public static void main(String[] args) {
        Scanner wg = new Scanner(System.in);
        System.out.println("Enter your Wajan : ");
        double kg = wg.nextDouble();
        converter_wg(kg);

    }
    public static double converter_wg(double mass){
       double mass2,mass1;
        mass1= mass*1000;
        System.out.println("your weight is " +mass1 +" gram.");
        mass2= mass1*1000000;
        System.out.println("your weight is " +mass2 +" miligram.");
        return 0;
    }
}
