package recursion_topic;

import java.util.Scanner;

public class facttt {
   public static long factttt(int num)
   {
       if (num>1)
       return num* factttt(num-1);
       else  {
           return 1;
       }

   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int store = sc.nextInt();
        long result= factttt(store);
        System.out.println("The result is " +result);


    }
}
