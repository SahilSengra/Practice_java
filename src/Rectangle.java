 class Rectangle {
    double length;
     double width;
     public Rectangle()
     {

     }

    public Rectangle( double length, double width){
        this.length= length;
        this.width=width;
        if(length<0)
            this.length = 0;
        else
            this.length=length;
        if(width<0)
            this.width=0;
        else
            this.width= width;
    }
    public double getLength(){
        return length;
    }
    public double getWidth(){
        return width;
    }
    public double getArea(){
        return  length * width;
    }

}
class  Cuboid extends Rectangle
{
    double hight;
    Rectangle rectangle;

    public Cuboid(Rectangle rectangle, double hight)
    {
        if (hight < 0)
            this.hight = 0;
        else
            this.hight = hight;
        this.rectangle = rectangle;
    }
    public  double getHight()
    {
        return hight;

    }
    public double getVolume()
    {
        return rectangle.getArea() * getHight();
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle (2, 3);
        System.out.println ("rectangle length =" + rectangle.getLength ());
        System.out.println ("rectangle width =" + rectangle.getWidth ());
        System.out.println ("area= " + rectangle.getArea ());
        Cuboid cuboid = new Cuboid (rectangle, 5);
        System.out.println ("height= " + cuboid.getHight ());
        System.out.println ("cuboid volume= " + cuboid.getVolume ());
    }
}
