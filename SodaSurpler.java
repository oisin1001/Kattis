// Link - https://open.kattis.com/problems/sodasurpler

import java.util.Scanner;

public class SodaSurpler {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int emptyBottles = sc.nextInt();
        int drank = 0;

        emptyBottles += sc.nextInt();
        int cost = sc.nextInt();


        while (emptyBottles >= cost) {
            emptyBottles -= cost;
            drank++;
            emptyBottles++;
        }

        System.out.println(drank);
    }
}