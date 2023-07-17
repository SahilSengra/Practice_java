package wall;

public class wall {
    private  double width;
    private double height;

    public wall()
    {

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public wall(double width, double height){
        if(width<0)
        {
            width=0;
        }
        if (height<0)
        {
            height=0;
        }
        this.width=width;
        this.height=height;

    }
    public double getArea()
    {
        return getHeight()*getWidth();
    }

    public static void main(String[] args) {
        wall wall = new wall (5, 4);
        System.out.println ("area= " + wall.getArea ());
        wall.setHeight (-1.5);
        System.out.println ("width=" + wall.getWidth ());
        System.out.println ("height= " + wall.getHeight ());
        System.out.println ("area= " + wall.getArea ());
    }
}
