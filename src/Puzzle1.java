public class Puzzle1 {
    public static void jPuzzle(int i) {
        System.out.println("jPuzzle");
    }

    public static void jPuzzle(Integer i) {
        System.out.println("Puzzle Java");
    }

    public static void jPuzzle(Object o) {
        System.out.println("Java Puzzle");
    }

    public static void main(String args[]) {
        jPuzzle(null);
    }
}