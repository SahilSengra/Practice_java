package SnakeGame_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import static SnakeGame_2.Rectangle.r_height;
import static SnakeGame_2.Rectangle.r_width;

//Snake ----> collection of rectangle
public class Snake extends JPanel {
    // extends JPanel because we will drawing this object on the screen
    // jFrame in main will be used as container which we will draw this Snake
    // all drawing is here


    //background color
    private static final Color c = new Color(115, 162, 78);
    private static final int start = 250;
    private static final int speed = 25;

    // Body of Snake is collection of rectangles
    private ArrayList<Rectangle> body;
    // Snake direction in which it moves
    private String direction;
    // attaching an Apple to our Snake, all drawing are happening in the same time
    private Apple apple;
    // reference to main window
    private final Main window;

    //passing the reference main because we are calling the Snake from main
    public Snake(SnakeGame_2.Main window) {
        this.window = window;
        // Array list of 3 rectangles
        this.body = new ArrayList<>();
        body.add(new Rectangle(start, start));
        Rectangle last = this.body.get(0);
        body.add(new Rectangle(last.getX() - r_width, last.getY()));
        Rectangle last_2 = this.body.get(1);
        body.add(new Rectangle(last_2.getX() - r_width, last_2.getY()));
        // first/start direction is RIGHT
        this.direction = "right";
    }

    public String getDirection() {
        return this.direction;
    }

    // once the user press the key we wants to set direction
    public void setDirection(String direction) {
        this.direction = direction;
    }

    // add rectangle after the last element
    // get the last element
    public void addPart() {
        Rectangle last = this.body.get(this.body.size() - 1);
        switch (this.direction) {
            case "right" -> this.body.add(new Rectangle(last.getX() - r_width, last.getY()));
            case "left" -> this.body.add(new Rectangle(last.getX() + r_width, last.getY()));
            case "up" -> this.body.add(new Rectangle(last.getX(), last.getY() + r_width));
            case "down" -> this.body.add(new Rectangle(last.getX(), last.getY() - r_width));
        }
    }

    public void checkCollision() {

        // take the first piece of the Snake
        Rectangle r3 = this.body.get(0);

        if(r3.getX() > 500 || r3.getY() > 500 || r3.getX() < 0 || r3.getY() < 0){
            System.out.println("You lose!");
            this.window.setVisible(false);

            JFrame parent = new JFrame("Game over!");
            JOptionPane.showMessageDialog(parent, "Your score: " + this.body.size());
            //destroy this window
            this.window.dispatchEvent(new WindowEvent(this.window, WindowEvent.WINDOW_CLOSING));
            // exit app
            System.exit(0);

        }

        for (int i = 1; i < this.body.size(); i++) {
            Rectangle r2 = this.body.get(i);
            // if that piece hitting the tail/ or some body part of the Snake --> stop game
            if (r3.intersects(r2)) {
                System.out.println("You lose!");
                this.window.setVisible(false);

                JFrame parent = new JFrame("Game over!");
                JOptionPane.showMessageDialog(parent, "Your score: " + this.body.size());
                //destroy this window
                this.window.dispatchEvent(new WindowEvent(this.window, WindowEvent.WINDOW_CLOSING));
                // exit app
               // System.exit(0);
                break;
            }
        }

        // if the Snake hit the apple
        if (this.apple != null) {
            if (r3.intersects(new Rectangle(this.apple.getX(), this.apple.getY()))) {
                //set apple to NULL
                this.apple = null;
                // add part of body
                this.addPart();
            }
        }

    }

    public void moveSnake() {
        // crate new array in which we will store the new position of the Snake
        ArrayList<Rectangle> newLst = new ArrayList<>();

        //get first element
        Rectangle first = this.body.get(0);
        // create new Rectangle with coordinate of FIRST
        Rectangle head = new Rectangle(first.getX(), first.getY());

        // set position equal to speed, speed = 25
        // move head(new Rectangle)
        switch (this.direction) {
            case "right" -> head.setX(speed);
            case "left" -> head.setX(-speed);
            case "up" -> head.setY(-speed);
            case "down" -> head.setY(speed);
        }

        // add head to the new List
        newLst.add(head);

        for (int i = 1; i < this.body.size(); i++) {
            // new rectangle go on the position of previous rectangle
            Rectangle previous = this.body.get(i - 1);
            Rectangle newRec = new Rectangle(previous.getX(), previous.getY());
            newLst.add(newRec);
        }
        // new list become the body of the Snake
        this.body = newLst;
        // check collision after move
        checkCollision();
    }

    //
    private void drawSnake(Graphics g) {
        //move snake every 150ms (timer in main)
        moveSnake();

        // draw moved snake
        // graphics 2D object
        Graphics2D g2d = (Graphics2D) g;

        // draw apple
        if (this.apple != null) {
            g2d.setPaint(Color.red);
            g2d.drawRect(this.apple.getX(), this.apple.getY(), r_width, r_height);
            g2d.fillRect(this.apple.getX(), this.apple.getY(), r_width, r_height);
        }
        // draw body
        g2d.setPaint(Color.blue);
        for (Rectangle rec : this.body) {
            g2d.drawRect(rec.getX(), rec.getY(), r_width, r_height);
            g2d.fillRect(rec.getX(), rec.getY(), r_width, r_height);
        }
    }

    public Apple getApple() {
        return this.apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    // method form JPanel
    // gets called form main
    // redraw the screen (timer in main)
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(c);
        drawSnake(g);
    }


}
