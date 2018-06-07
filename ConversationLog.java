import java.util.*;

public class ConversationLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfLines = sc.nextInt();

        String[] names = new String[100];
        ArrayList<String> namesAL = new ArrayList<>();
        ArrayList<HashSet<String>> set = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        sc.nextLine();

        for(int i = 0; i < numberOfLines; i++) {
            String line = sc.nextLine();
            Scanner lineSc = new Scanner(line);
            String name = lineSc.next();
            int index = i;
            for (String n : namesAL) {
                if (name.equals(n)) {
                    index = namesAL.indexOf(n);
                }
            }

            while(lineSc.hasNext()) {
                String next = lineSc.next();
                if (index == set.size()) {
                    set.add(new HashSet<>());
                }
                set.get(index).add(next);
            }
        }

        System.out.println("Lol");
    }
}
