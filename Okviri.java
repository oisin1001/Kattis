import java.util.Scanner;

public class Okviri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        firstLine(word);
        secondLine(word);
        thirdLine(word);
        secondLine(word);
        firstLine(word);
    }

    private static void firstLine(String word) {
        System.out.print("..#..");
        for (int i = 1; i < word.length(); i++) {
            if (i % 3 == 2) {
                System.out.print(".*..");
            } else {
                System.out.print(".#..");
            }
        }
        System.out.println();
    }

    private static void secondLine(String word) {
        System.out.print(".#.#.");
        for (int i = 1; i < word.length(); i++) {
            if (i % 3 == 2) {
                System.out.print("*.*.");
            } else {
                System.out.print("#.#.");
            }
        }
        System.out.println();
    }

    private static void thirdLine(String word) {
        System.out.print("#."+ word.charAt(0) + ".#");
        for (int i = 1; i < word.length(); i++) {
            if (i % 3 == 2) {
                System.out.print("."+ word.charAt(i) + ".*");
            } else if (i % 3 == 1 && i < word.length() - 1) {
                System.out.print("." + word.charAt(i) + ".*");
            } else {
                System.out.print("."+ word.charAt(i) + ".#");
            }
        }
        System.out.println();
    }
}


/*

..#..
.#.#.
#.X.#
.#.#.
..#..

 */