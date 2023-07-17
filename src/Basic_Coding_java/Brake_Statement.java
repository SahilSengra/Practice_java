package Basic_Coding_java;

import java.util.Scanner;

public class Brake_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number using space ");
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i=low;i<high;i++){
            System.out.println(+i+ " ");
            if (i%13==0)
                break;
        }
    }
}
