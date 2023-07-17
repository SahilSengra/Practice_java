import java.util.*;
class Solution{
    public double area(float B , float H){
        double a = B*H;
        return a;
    }
}
class HelloWorld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Breadth of the parallelogram: ");
        float B = in.nextFloat();
        System.out.print("Enter the Height of the parallelogram: ");
        float H = in.nextFloat();
        if ((H<=0) || (B<=0)){
            System.out.print("java.lang.Exception : breadth and height must be positive ");
        }
        Solution S1 = new Solution();
        double Area;
        Area= S1.area(B,H);
        System.out.print("Area of the parallelogram is :" + Area);
    }
}