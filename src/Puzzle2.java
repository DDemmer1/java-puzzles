import java.util.Random;

public class Puzzle2 {
    private static Random rd = new Random();

    public static void main(String args[]) {
        StringBuffer word;
        switch (rd.nextInt(2)) {
            case 1:
                word = new StringBuffer('K');
            case 2:
                word = new StringBuffer('L');
            default:
                word = new StringBuffer('J');
        }
        word.append('a');
        word.append('v');
        word.append('a');
        System.out.println(word);
    }
}
