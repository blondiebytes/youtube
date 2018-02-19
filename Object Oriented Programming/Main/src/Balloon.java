import java.awt.Color;

public class Balloon {
    int xPosition;
    int yPosition;
    Color color;
    boolean isPopped;
    int id;

    public Balloon(int xPos, int yPos, Color color, int id) {
        this.xPosition = xPos;
        this.yPosition = yPos;
        this.color = color;
        this.isPopped = false;
        this.id = id;
    }

    public void moveBalloon(int xSpaces, int ySpaces) {
        this.xPosition = xPosition + xSpaces;
        this.yPosition = yPosition + ySpaces;
    }

    public void changeColor(Color newColor) {

        this.color = newColor;
    }

    // More functionality
}
