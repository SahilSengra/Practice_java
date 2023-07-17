package recursion_topic;

import java.util.Scanner;

public class power_que {
    public static int  powr(int base,int powerr){
        if (base!= 0 && powerr > 0)
        return base * powr(base,powerr-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base : ");
        int base = sc.nextInt();
        System.out.println(" Enter power : ");
        int powerr = sc.nextInt();
        int result = powr(base ,powerr);
        System.out.println(" the final result is : "+ result);
    }
}
