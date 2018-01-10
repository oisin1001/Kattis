// Link - https://open.kattis.com/problems/rhyming

import java.util.ArrayList;
import java.util.Scanner;

public class RhymingSlang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int numberOfLines = sc.nextInt();
        ArrayList<String> sounds = new ArrayList<>();
        sc.nextLine();
        while(numberOfLines > 0){
            boolean match = false;
            String line = sc.nextLine();
            Scanner lc = new Scanner(line);
            while (lc.hasNext() && !match) {
                if (word.endsWith(lc.next())) {
                    match = true;
                }
            }
            if (match) {
                lc = new Scanner(line);
                while (lc.hasNext()) {
                    sounds.add(lc.next());
                }
            }
            numberOfLines--;
        }

        numberOfLines = sc.nextInt();
        sc.nextLine();
        while(numberOfLines > 0){
            boolean found = false;
            String phrase = sc.nextLine();
            for(String endings : sounds) {
                if (phrase.endsWith(endings)) {
                    found = true;
                }
            }
            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            numberOfLines--;
        }
    }

}
