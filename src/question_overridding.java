public class question_overridding {
    public static void area(int length){
        int detail= length*length;
        System.out.println("Aera of squre is : "+detail);
    }

    public static void area(int breadth,double hight) {
        double detail = 0.5 * breadth * hight;
        System.out.println("Aera of triangle is : " + detail);
    }

    public static void area(int length,int breadth) {
        int detail = length * breadth;
        System.out.println("Aera of rectangle is : " + detail);
    }

    public static void main(String[] args) {
        int length= 10;
        int breadth = 5;
        double hight = 2.45;

        area(length);
        area(length,breadth);
        area(breadth,hight);
    }
}
