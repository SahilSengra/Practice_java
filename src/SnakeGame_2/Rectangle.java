package SnakeGame_2;

public class Rectangle {
    public static final int r_width = 25;
    public static final int r_height = 25;
    private int x;
    private int y;

    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // lost game - hit a wall or hit a tall
    // get a point - hit an apple

    public boolean intersects(Rectangle r) {
        return this.x == r.getX() && this.y == r.getY();
    }

    //access current position
    public int getX() {
        return this.x;
    }

    //moving object across screen
    public void setX(int increment) {
        this.x = x + increment;;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int increment) {
        this.y = y + increment;;
    }
}
