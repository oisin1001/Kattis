import java.util.Scanner;

public class SecretMessage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numEntries = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numEntries; i++) {
            String message = sc.nextLine();

            boolean found = false;
            int squareLength = 0;
            int square = 0;

            for (int j = 1; !found; j++) {
                if (j * j >= message.length()) {
                    found = true;
                    squareLength = j*j;
                    square = j;
                }
            }

            for (int j = message.length(); j < squareLength; j++) {
                message += "*";
            }

            for (int j = 0; j < 3; j++) {
                for (int k = square-1; k >= 0; k--) {
                    if (message.charAt((j*k)) != '*') {
                        System.out.print(message.charAt(j * k));
                    }
                }
            }
        }
    }
}

// iloveyoujack**** -> *jei*ayl*coo*kuv
// 0123456789abcdef -> c840d951ea62fb73

// hello**** -> *lh*oe**l
// 012345678 -> 630741852

/**
6
3
0
7
4
1
8
5
2

 length = 9
 square = 3
 */