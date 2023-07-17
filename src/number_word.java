public class number_word {
    public static void convert(int num){
        if(num==1){
            System.out.println("One");
        } else if (num==2) {
            System.out.println("two");
        }else if (num==3) {
            System.out.println("three");
        }else if (num==4) {
            System.out.println("four");
        }else if (num==5) {
            System.out.println("five");
        }else if (num==6) {
            System.out.println("six");
        }else if (num==7) {
            System.out.println("seven");
        }else if (num==8) {
            System.out.println("eight");
        }else if (num==9) {
            System.out.println("nine");
        }
        else
            System.out.println("number not b/w 1to 10");
    }

    public static void main(String[] args) {
        convert(1);
        convert(2);
        convert(3);
        convert(4);
        convert(5);
        convert(6);


    }
}
