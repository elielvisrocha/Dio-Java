public class User {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.err.println("Tv turn On? " + smartTv.turnOn);
        System.out.println("Currently channel? " + smartTv.channel);
        System.out.println("Currently sound? " + smartTv.sound);

    }
}
