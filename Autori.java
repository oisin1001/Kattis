// Link - https://open.kattis.com/problems/autori

import java.util.Scanner;

public class Autori {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        String result = "";

        result += word.charAt(0);

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == '-') {
                i++;
                result = result + word.charAt(i);
            }
        }

        System.out.println(result);

    }
}