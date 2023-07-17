import java.util.Scanner;

public class pythagorian_triples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        int b = sc.nextInt();
        System.out.println("Enter third Number : ");
        int c = sc.nextInt();
        tripletes(a,b,c);

    }
    public static int tripletes(int a ,int b, int c){
        int p= a*a;
        int q= b*b;
        int r= c*c;

        if ((p+q==r))
            System.out.println("the number is pythogorin triples .");
        else
            System.out.println("the number is not pythogorian triples.");
        return 0;
    }
}
