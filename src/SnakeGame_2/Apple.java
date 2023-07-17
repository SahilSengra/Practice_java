package SnakeGame_2;

import java.util.Random;
import java.util.TimerTask;

// apple is also rectangle
public class Apple extends TimerTask {
    private int x;
    private int y;
    // reference to the Snake
    private Snake snake;

    public Apple(Snake snake) {
        this.snake = snake;
    }

    public Apple() {
        // dont change position until we eat apple
        // screen 500 x 500
        // generate number between 500 in x direction and 500 in y direction
        this.x = 25 * new Random().nextInt(19);
        this.y = 25 * new Random().nextInt(19);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void run() {
        // when we eat apple, create new
        // use timer task - > every 3 sec if the apple is null
        // we want to attach new apple to our snake and draw it on the screen
        // every 3sec we have thread that is checking if apple == NULL
        if (this.snake.getApple() == null) {
            this.snake.setApple(new Apple());
        }
    }
}
