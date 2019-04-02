import java.math.BigInteger;

public class Puzzle3 {
    public static void main(String[] args) {
        Integer a = (184 - 100) / 2;
        Integer b = 42;
        Integer c = (2774 - 100) / 2;
        Integer d = 1337;

        BigInteger big1 = new BigInteger("1000");
        big1.add(new BigInteger("2"));

        BigInteger big2 = big1.add(new BigInteger(b.toString()));

        System.out.println(a == b);
        System.out.println(c == d);
        System.out.println(big2.intValue() == 1044);
    }
}
