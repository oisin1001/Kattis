// Link - https://open.kattis.com/problems/savingforretirement

import java.util.Scanner;

public class SavingForRetirement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bobAge = sc.nextInt();
        int bobRetire = sc.nextInt();
        int bobAmount = sc.nextInt();
        int bobTotal = (bobRetire - bobAge) * bobAmount;

        int aliceAge = sc.nextInt();
        int aliceAmount = sc.nextInt();
        int aliceRetire = aliceAge;
        int aliceYears = 0;

        while (aliceYears * aliceAmount <= bobTotal) {
            aliceYears++;
        }

        System.out.println(aliceAge + aliceYears);
    }
}