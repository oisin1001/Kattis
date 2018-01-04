// Link - https://open.kattis.com/problems/humancannonball2

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HumanCannonball2 {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("src/txt/HumanCannonball2.txt");
        Scanner sc = new Scanner(f);
        int numberOfCases = sc.nextInt();

        for(int i = 0; i < numberOfCases; i++) {
            double speed = sc.nextDouble();
            double angle = sc.nextDouble();
            double xDistance = sc.nextDouble();
            double bottomHeight = sc.nextDouble();
            bottomHeight += 1;
            double topHeight = sc.nextDouble();
            topHeight -= 1;

            double radians = Math.toRadians(angle);

            double time = xDistance / (speed * Math.cos(radians));
            double yValue = speed * time * Math.sin(radians) - 0.5*9.81*time*time;

            if (yValue >= bottomHeight && yValue <= topHeight) {
                System.out.println("Safe");
            } else {
                System.out.println("Not Safe");
            }
        }

    }

}

//    xValue == v * t * cos(angle)
//    t = xValue / (v * cos(angle))

//    yValue == v * t * cos(angle) - 0.5*g*t*t