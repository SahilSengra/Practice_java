package Basic_Coding_java;

import java.util.Scanner;

public class array_1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array : ");
        int n= sc.nextInt();

        int arr[]= new int[n];
        System.out.println("Enter the Element of the array : ");

        for(int i=0;i<n;i++)
            arr[i]= sc.nextInt();


        System.out.println("\n Array element are : ");
        for(int i=0; i<n;i++)
            System.out.println(arr[i] + " ");
    }
}
