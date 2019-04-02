import java.math.BigInteger;

public class Puzzle4 {
    public static void main(String args[]){
        BigInteger big1 = new BigInteger("1000");
        big1.add(new BigInteger("2"));

        BigInteger big2 = new BigInteger("1002");

        System.out.println(big1.equals(big2));
    }
}
