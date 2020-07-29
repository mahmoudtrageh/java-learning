public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature >= 25 && temperature <=35) {
            System.out.println("yes playing");
            return true;
        } else if (summer && temperature >= 25 && temperature <= 45) {
            System.out.println("yes playing");
            return true;
        } else {
            System.out.println("Not playing");
            return false;
        }
    }
}
