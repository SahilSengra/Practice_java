package exceptiions;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;

        System.out.println(divide(x,y));
    }


    private  static  int getInt(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public  static  double divide ( int a, int b){
        if (b!=0)
            return a/b;
        else return 0;
    }

//    public  static double divideEAFP(int a,int b){
//        try {
//            return a/b;
//        }catch((ArithmeticException e))
//        return 0;
//    }
}
