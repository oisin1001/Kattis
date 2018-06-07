import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Float.NaN;

public class SecretSanta2 {

    public static BigInteger factorial(BigInteger n){
       if (n.equals(BigInteger.ONE) || n.equals(BigInteger.ZERO)) {
            return BigInteger.valueOf(1);
        }
        BigInteger nLess = n.subtract(BigInteger.ONE);
        return n.multiply(factorial(nLess));
    }

    public static void attempt() {
      //  System.out.println(factorial(33));
        Scanner sc = new Scanner(System.in);
        BigInteger townSizeBig = sc.nextBigInteger();
        BigInteger thirtyTwo = new BigInteger("32");
        if (townSizeBig.compareTo(thirtyTwo) > 0) {
            System.out.println(0.6321206);
            return;
        }
        int townSize = townSizeBig.intValue();
        BigInteger numPerms = factorial(BigInteger.valueOf(townSize));
        float sum = 0;

        for (int i = 0; i <= townSize; i++) {
            BigInteger lower = factorial(BigInteger.valueOf(i));
            sum += Math.pow(-1.0, i) / lower.intValue();
        }
        sum = 1 - sum;
//        sum *= factorial(townSize);
            System.out.println(sum);
    }

    public static void main(String[] args) {
        attempt();
    }
}