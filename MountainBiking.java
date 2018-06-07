import java.util.Scanner;

public class MountainBiking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = sc.nextInt();
        int[] distance = new int[n];
        int[] angle = new int[n];
        for(int i = 0; i < n; i++) {
            distance[i] = sc.nextInt();
            angle[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++) {
            double velocity = 0.0;
            for (int j = i; j < n; j++) {
                double a = g * Math.cos(Math.toRadians(angle[j]));
                velocity = (Math.pow(velocity, 2)) + (2.0 * a * distance[j]);
                velocity = Math.sqrt(velocity);
            }
           System.out.println(String.format("%.6f", velocity));
        }
    }
}