
interface  cheak{
    public  void say();
}
public class lamda_expression {
    public static void main(String[] args) {
        cheak c = () -> {
            int a=4;int b=5;
            System.out.println( " the sum is " + (a+b));
            System.out.println(" Hi this is laura function");
        };


        c.say();
    }

}
