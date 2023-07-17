import java.util.Scanner;

public class Users_table {
    public static void tablePrint(int n){
        int table =0;
        for(int i=1;i<=10;i++){
            table= n*i;
            System.out.println(n+"*"+i+ "=" + table);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Eneter the number : ");
        int st = sc.nextInt();
        tablePrint(st);
    }
}
