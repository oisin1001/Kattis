import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Everywhere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        while (numCases > 0) {
            int numDestinations = sc.nextInt();
            HashSet set = new HashSet();
            while(numDestinations > 0) {

                set.add(sc.next());

                numDestinations--;
            }
            System.out.println(set.size());
            numCases--;
        }

    }
}

/*
2
7
saskatoon
toronto
winnipeg
toronto
vancouver
saskatoon
toronto
3
edmonton
edmonton
edmonton
 */