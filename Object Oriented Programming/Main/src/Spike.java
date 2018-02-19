public class Spike {
    int xPosition;
    public static final int yPosition = 0;

    public Spike(int xPosition) {
        this.xPosition = xPosition;

    }

    public void popBalloon(Balloon balloon) {
        // if spike hits balloon -> isPopped becomes true
        // otherwise -> isPopped becomes false
    }

    public void moveSpikeHorizontally(int spaces) {
        this.xPosition = xPosition + spaces;

    }

    // More functionality


}
