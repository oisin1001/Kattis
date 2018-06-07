// Link - https://open.kattis.com/problems/secretsanta

import java.util.Scanner;
import java.util.ArrayList;

public class SecretSanta {
    public ArrayList<String> perms = new ArrayList<>();

    public void test() {
        Scanner sc = new Scanner(System.in);
        int townSize = sc.nextInt();
        int numPerms = factorial(townSize);
        int[][] townArray = new int[numPerms][townSize];
        String sample = "";

        char[] alpha = new char[townSize];
        for(int i = 0; i < townSize; i++){
            alpha[i] = (char)(97 + i);
        }
        String word = new String(alpha);
        stringPermutation(word, "");
        int badPermCounter = 0;

        for(int i = 0; i < numPerms; i++) {
            boolean badPerm = false;
            for(int j = 0; j < townSize && !badPerm; j++)
            {
                if(perms.get(i).charAt(j) == (char)(97+j)) {
                    badPerm = true;
                }
            }
            if (badPerm) {
                badPermCounter++;
            }
        }
        double badPermDoub = (double)badPermCounter;
        double numPermsDoub = (double)numPerms;
        System.out.println(badPermDoub/numPermsDoub);
    }

    public static int factorial(int n){
        if (n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }

    public void stringPermutation(String input, String addOn) {
        // TODO
        if (input.length() == 0) {
            // When the "input" section is empty, the "addon" string contains all of the possible letters - I can now print it
      //      System.out.println(addOn);
            perms.add(addOn);

        }

        // This for loop goes through each possible letter in the string
        for (int i = 0; i < input.length(); i++) {
            // This sets the input to be every letter apart from the letter located at i - the letter located at i is added to the end of the string "addOn" instead
            // This is ran recursively until input.length is 0
            stringPermutation(input.substring(0, i) + input.substring(i+1, input.length()), addOn + input.charAt(i));
        }
    }

    public static void attempt() {
        Scanner sc = new Scanner(System.in);
        int townSize = sc.nextInt();
        int numPerms = factorial(townSize);
        double sum = 0.0;

        for (int i = 0; i < townSize; i++) {
            sum += Math.pow(-1.0, i) / factorial(i);
        }
        System.out.println(sum);
    }


    public static void main(String[] args){
//        SecretSanta eh = new SecretSanta();
//        eh.test();
        attempt();
    }
}
