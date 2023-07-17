package Basic_Coding_java;

import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age= sc.nextInt();

        if(age<18){
            System.out.println("you are not able for voting");
        }
        else {
            System.out.println("ja k vote de bsdk");
        }

    }
}
