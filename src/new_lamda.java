import java.util.Scanner;

interface lam {
    boolean test(int a);

        }
public class new_lamda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int n = sc.nextInt();

        lam lp = (year) ->{
            if ((year %400 ==0) || ((year %4 ==0) && (year % 100 !=0)))
                return true;
            else
                return  false;
        };

        if(lp.test(n))
            System.out.println("yes " + n + " is the leap year");
        else
            System.out.println(" this is not leap year");
    }
}
