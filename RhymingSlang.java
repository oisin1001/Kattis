import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RhymingSlang {
    public static void main(String[] args) {
        File f = new File("src/RhymingSlang.txt");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int numberOfLines = sc.nextInt();
        ArrayList<String> sounds = new ArrayList<>();
        sc.nextLine();
        while(numberOfLines > 0){
            boolean match = false;
            String line = sc.nextLine();
            Scanner lc = new Scanner(line);
            while (lc.hasNext() && match == false) {
                if (word.endsWith(lc.next())) {
                    match = true;
                }
            }
            if (match == true) {
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
