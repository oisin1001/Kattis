// Link - https://open.kattis.com/problems/grassseed

import java.util.Scanner;

public class GrassSeedInc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cost = sc.nextDouble();
        int numberOfLawns = sc.nextInt();
        double totalCost = 0.0, width, length, area;

        for (int i = numberOfLawns; i > 0; i--) {
            width = sc.nextDouble();
            length = sc.nextDouble();
            area = width * length;

            totalCost += area * cost;
        }

        System.out.println(totalCost);
    }

}



