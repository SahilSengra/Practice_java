package Basic_Coding_java;

import java.util.Scanner;

public class all_operations {
    static int add( int x , int y){
        int sum;

         sum = x+y;
        return sum;
    }
    static  int subtract( int x, int y){
        int sub;
         sub= x-y;
        return sub;

    }
    static  int multiply (int x, int y){
        int mul;
         mul = x*y;
        return mul;
    }
    static int divide(int x,int y){
        int div;
         div = x%y;
        return div;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter first number  : ");
        int a= sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();


        System.out.println(" the sum of " +a+ " and "+b+ " is : " +add(a,b));

        System.out.println(" the Subtract of " +a+ " and "+b+ " is : " +subtract(a,b));

        System.out.println(" the Multiply of " +a+ " and "+b+ " is : " +multiply(a,b));

        System.out.println(" the Division of " +a+ " and "+b+ " is : " +divide(a,b));
    }
}
