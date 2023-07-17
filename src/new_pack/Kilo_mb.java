package new_pack;

import java.util.Scanner;

public class Kilo_mb {
    public static void main(String[] args) {
        Scanner mm = new Scanner(System.in);
        System.out.println("Enter kilo byte : ");
        int kb = mm.nextInt();
        converter_hai(kb);
    }
    public static int converter_hai(int val){
        int val1;
        val1= val*1024;
        System.out.println("The anser is " +val1);
        return 0;
    }
}
