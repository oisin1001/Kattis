import java.util.HashMap;
import java.util.Scanner;

public class Fridge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> sure = new HashMap();
        String input = sc.nextLine();
        int digits[] = new int[input.length()];

        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            digits[i] = Character.getNumericValue(c);
        }

        for(int i = 0; i < 10; i++) {
            sure.put(i, 0);
        }

        for(int i = 0; i < input.length(); i++) {
            sure.put(digits[i], sure.get(digits[i]) + 1);
        }

        int firstDigits = 0, finalDigit = 0, length = 1;
        boolean found = false;

        for (length = 1; !found; length++) {
            for (finalDigit = 0; finalDigit < 9 && !found; finalDigit++) {
                if (length > sure.get(finalDigit)) {
                    found = true;
                    break;
                }
            }
            if (finalDigit == 9) {
                firstDigits++;
            }
        }

        if (finalDigit == 0) {
            firstDigits++;
        }

        System.out.println(firstDigits + "" + finalDigit);
    }
}