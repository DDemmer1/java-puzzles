import java.math.BigInteger;

public class Puzzle4 {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder('P');
        sb.append("uzzle");

        char[] puzzle = {80,'u','z','z','l',101};
        System.out.println(sb.toString().equals(String.copyValueOf(puzzle)));

//      Check out twitter.com\u000d  System.out.println("Unicode rocks 🤘");
    }
}
