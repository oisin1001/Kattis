// Link - https://open.kattis.com/problems/hissingmicrophone

import java.util.Scanner;

public class HissingMicrophone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        for (int i = 0; i < word.length() - 1; i++) {
            if (word.charAt(i) == 's') {
                if (word.charAt(i+1) == 's') {
                    System.out.println("hiss");
                    return;
                }
            }
        }
        System.out.println("no hiss");
    }
}
