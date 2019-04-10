import java.util.concurrent.TimeUnit;

public class Puzzle6 {
    public static void main(String args[]) {
        long microsPerDay = 24 * 60 * 60 * 1000 * 1000;
        System.out.println(TimeUnit.HOURS.toMicros(24) == microsPerDay);
    }
}



