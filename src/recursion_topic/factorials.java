package recursion_topic;

import java.util.Scanner;

public class factorials{
    public  static  long fact(int num){
        if (num >= 1)
            return num* fact(num - 1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number for factorial : ");
        int store = sc.nextInt();
        long result = fact(store);
        System.out.println("Factorial of " +store+ " is : " +result);
    }

}
