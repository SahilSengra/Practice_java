package Basic_Coding_java;

import java.util.Scanner;

public class N_natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int st= sc.nextInt();

//        int i =1;
//
//        while (i<=st){
//            System.out.println(i + " ");
//            i++;
//        }
        //int i;
//        for ( i =1;i<=st;i++)
//        System.out.println(i+ " ");
        int i =1;
        do{
            System.out.println(i + " ");
            i++;
        }while (i<=st);
    }
}
