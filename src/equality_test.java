public class equality_test {
    public static void printEqual( int a,int b, int c){
        if(a<0||b<0||c<0) {
            System.out.println("galat hai bhai");
        }
        else if (a==b && b==c && a==c) {
            System.out.println("all are equal");
        } else if (a!=b && b!=c && a!=c) {
            System.out.println("all are different");
        }

        else
            System.out.println("sb jaise taise hai.");
    }

    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1,2,3);
        printEqual(0,4,5);
        System.out.println("prep ka input");
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }
}
