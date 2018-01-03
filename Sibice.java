import java.util.Scanner;

public class Sibice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOfMatches = sc.nextInt();
        int height = sc.nextInt();
        int width = sc.nextInt();
        double maxLength = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
        int[] arr = new int[numOfMatches];

        for (int i = 0; i < numOfMatches; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i : arr) {
            if (i <= maxLength) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
            numOfMatches--;
        }

    }
}