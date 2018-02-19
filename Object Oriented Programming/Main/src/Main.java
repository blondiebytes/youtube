import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Balloon balloonA = new Balloon
                (75, 49, Color.BLUE, 1);
        Balloon balloonB = new Balloon
                (30, 110, Color.PINK, 2);

        balloonA.moveBalloon(20, 89);
        System.out.println(balloonA.xPosition);
        System.out.println(balloonA.yPosition);
        System.out.println(balloonB.xPosition);
        System.out.println(balloonB.yPosition);
        System.out.println();

        balloonB.moveBalloon(21, -30);
        System.out.println(balloonA.xPosition);
        System.out.println(balloonA.yPosition);
        System.out.println(balloonB.xPosition);
        System.out.println(balloonB.yPosition);

        }

}
