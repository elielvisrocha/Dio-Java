public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("Currently channel: " + smartTv.channel);
        smartTv.changeChannel(12);

        System.err.println("Tv turn On? " + smartTv.turnOn);
        System.out.println("Currently channel: " + smartTv.channel);
        System.out.println("Currently sound?: " + smartTv.sound);

        smartTv.turn_On();
        System.err.println("Tv turn On? " + smartTv.turnOn);

        smartTv.increaseSound();
        System.out.println("Currently sound?: " + smartTv.sound);

        smartTv.decreaseSound();
        System.out.println("Currently sound?: " + smartTv.sound);

    }
}
