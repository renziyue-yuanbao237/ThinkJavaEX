import java.math.BigInteger;
public class Bet {
    static BigInteger zer=new BigInteger("0");
    static BigInteger uni=new BigInteger("1");
    static BigInteger twi=new BigInteger("2");
    public static BigInteger pow(BigInteger x, BigInteger n) {
        if (n.equals(zer)) return uni;
// find x to the n/2 recursively
        BigInteger t = pow(x, n.divide(twi));
// if n is even, the result is t squared
// if n is odd, the result is t squared times x
        if (n.remainder(twi).equals(zer)) {
            return t.multiply(t);
        } else {
            return t.multiply(x).multiply(x);
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(new BigInteger("10"),new BigInteger("2")));
    }
}