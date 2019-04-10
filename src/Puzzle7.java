public class Puzzle7 {
    public static void main(String[] args) {
        int x = 1337;
        int y = 42;
        x ^= y ^= x ^= y;
        System.out.println(x);
        System.out.println(y);
    }
}
