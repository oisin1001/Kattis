// Link - https://open.kattis.com/problems/modulo

import java.util.Scanner;

public class Modulo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int number = sc.nextInt();
            arr[i] = number % 42;
        }

        int unique = 10;

        for (int i = 0;i < arr.length; i++) {
            boolean found = false;
            for (int j=i+1; j < arr.length && !found; j++) {
                if (i != j && arr[i] == arr[j]) {
                    unique--;
                    found = true;
                }
            }
        }

        System.out.println(unique);

    }
}