// Link: https://open.kattis.com/problems/deathknight/

import java.util.Scanner;

public class DeathKnight {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfTurns = sc.nextInt();
        int counter = 0;

        while(numberOfTurns > 0) {
            String play = sc.next();

            if (!play.contains("CD")) {
                counter++;
            }

            numberOfTurns--;
        }

        System.out.println(counter);
    }
}
