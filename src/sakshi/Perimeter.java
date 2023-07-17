package sakshi;

public class Perimeter {
    public static void main(String[] args) {
        per(3,5);
        area(5,6);
    }
    public static int per ( int length, int breadth){
        int perimeter = 2*(length+breadth);
        System.out.println("the perimer of lenth " + length+ " and breadth  " +breadth + " is " +perimeter);
        return perimeter;
    }
    public  static  int area ( int length , int breadth ){
        int area = length*breadth;
        System.out.println("the Area of lenth " + length+ " and breadth  " +breadth + " is " +area);
        return area;
    }
}
