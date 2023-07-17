import java.util.Scanner;

class methodChallenge {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name ");
        String student_name = sc.nextLine();
        System.out.println("Enter " + student_name + " score");
        int student_score = sc.nextInt();
        char student_divison = calculateStudentDivison(student_score);

        displayRank(student_name, student_divison);
    }

    public static void displayRank(String name, char divison) {
        System.out.println(name + " has secured " + divison + " divison");

    }

    public static char calculateStudentDivison(int student_score) {
        char division;
        if (student_score >= 80) {
            division = 'A';
            return division;
        } else if (student_score < 80 && student_score >= 60) {
            division = 'B';
            return division;
        } else if (student_score < 60 && student_score >= 40) {
            division = 'C';
            return division;
        } else if (student_score < 40) {
            division = 'F';
            return division;
        }
        return 0;
    }
}