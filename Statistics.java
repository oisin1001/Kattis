import java.util.Scanner;

public class Statistics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entry = 0;

        while(sc.hasNext()) {
            entry++;
            int numEntries = sc.nextInt();
            int[] values = new int[numEntries];
            int max = -10000000, min = 10000000;
            for(int i = 0; i < numEntries; i++) {
                values[i] = sc.nextInt();
                if (values[i] > max) {
                    max = values[i];
                }
                if (values[i] < min) {
                    min = values[i];
                }
            }
            int range = max - min;
            System.out.println("Case " + entry + ": " + min + " " + max + " " + range);
        }
    }
}