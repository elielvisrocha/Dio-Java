public class SmartTv {
    boolean turnOn = false;
    int channel = 1;
    int sound = 25;

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }

    public void increaseChannel() {
        channel++;
    }

    public void decreaseChannel() {
        channel++;
    }

    public void increaseSound() {
        sound++;
        System.err.println("Increasing sound to " + sound);
    }

    public void decreaseSound() {
        sound--;
        System.err.println("Decreasing sound to " + sound);
    }

    public void turn_On() {
        turnOn = true;
    }

    public void turn_Off() {
        turnOn = true;
    }
}
