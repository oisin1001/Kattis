import java.util.Scanner;

public class UnlockPattern {

    public static void main(String[] args) {
        int[][] grid = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        double distance = 0.0;

        for (int value = 1; value < 9; value++) {
            int xValue = 0, yValue = 0, xNext = 0, yNext = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (value == grid[i][j]) {
                        xValue = i;
                        yValue = j;
                    } else if (value+1 == grid[i][j]) {
                        xNext = i;
                        yNext = j;
                    }
                }
            }
            distance += Math.sqrt(((xNext - xValue) * (xNext - xValue)) + ((yNext - yValue) * (yNext - yValue)));
        }

        System.out.println(distance);
    }
}