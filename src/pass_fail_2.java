import java.util.Scanner;

public class pass_fail_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String store_name = sc.nextLine();
        System.out.println("Enter your score : ");
        int store_score = sc.nextInt();
        score_bta(store_score);
        //int  overall_grade = store_score;
       // last_thing(store_name,overall_grade);
    }

    public static int  score_bta(int score) {
        if (score >= 80)
            System.out.println(" Grade A ");
        else if (score >=60 && score <80) {
            System.out.println("Grade B ");

        } else if (score >=40 && score <60) {
            System.out.println("Grade C ");
        } else
            System.out.println("fail");
        return score;
    }
//    public static char last_thing(String name,String grade){
//        System.out.println("The "+name + "got "+grade);
//    }



}
