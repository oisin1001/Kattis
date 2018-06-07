import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MillstoneCounter {
    public static void main(String[] args) {
     //   try {
            tester();
        //} catch (ArithmeticException e) {
     //       System.out.println(0);
     //  }
    }

    static void tester() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int intervalsSize = m - 1;
        int distancesSize = n - 1;

        BigInteger[] passed = new BigInteger[m];
        BigInteger[] intervals = new BigInteger[m];
        BigInteger[] stones = new BigInteger[n];
        BigInteger[] distances = new BigInteger[n];

        for (int i = 0; i < m; i++) {
            passed[i] = sc.nextBigInteger();
        }

        for (int i = 0; i < m-1; i++) {
            intervals[i] = passed[i+1].subtract(passed[i]);
        }

        for (int i = 0; i < n; i++) {
            stones[i] = sc.nextBigInteger();
        }

        for (int i = 0; i < n-1; i++) {
            distances[i] = stones[i+1].subtract(stones[i]);
        }

        BigDecimal ratio = new BigDecimal("-1.0");
        Set<BigInteger> hs = new HashSet<>();

        for (int i = 0; i < distancesSize-intervalsSize+1; i++) {
            boolean speed = true;

            for (int j = 0; j < intervalsSize && speed; j++) {
                BigDecimal a = new BigDecimal(distances[i+j]);
                BigDecimal b = new BigDecimal(intervals[j]);
                if (j == 0) {
                    ratio = a.divide(b, MathContext.DECIMAL128);
                } else if (a.divide(b, MathContext.DECIMAL128) != ratio) {
                    speed = false;
                }

                if(speed && j == intervalsSize - 1) {
                    BigInteger r = new BigInteger(ratio.toBigInteger().toString());
                    hs.add(r);
                }
            }
        }

        // Prints results
        if (hs.size() == 1 && hs.contains(new BigInteger("0"))) {
            System.out.println(distancesSize);
            for (int i = 0; i < distancesSize; i++) {
                System.out.print(distances[i] + " ");
            }
        } else {
            System.out.println(hs.size());
            if (hs.size() != 0) {
                for (BigInteger h : hs) {
                    System.out.print(h.toString() + " ");
                }
            }
        }
    }
}