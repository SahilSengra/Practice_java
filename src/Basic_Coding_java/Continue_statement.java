package Basic_Coding_java;

import java.util.Scanner;

public class Continue_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number using space ");
        int low = sc.nextInt();
        int high = sc.nextInt();

        for(int i=low;i<high;i++){

            if (i%5==0)
                continue;
            System.out.println(+i+ " ");
        }
    }
}
