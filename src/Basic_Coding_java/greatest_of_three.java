package Basic_Coding_java;

import java.util.Scanner;

public class greatest_of_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter first number : ");
        double a = sc.nextDouble();
        System.out.println(" Enter Second number : ");
        double b = sc.nextDouble();
        System.out.println(" Enter Third number : ");
        double c = sc.nextDouble();
//        if(a>b && a>c){
//            System.out.println(+a+" is sbse bda");
//        }else if (b>a && b>c) {
//            System.out.println(+b+ " is sbse bda ");
//        }else if (c>a && c>b) {
//            System.out.println(+c+ " is sbse bda ");
//        }

        double result= Math.max(a, Math.max(b,c));
        System.out.println(+result+ " is sbse bda.");
    }
}
