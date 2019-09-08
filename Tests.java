import java.util.Arrays;

public class Tests {

    public static void main(String args[]) {
        arrayShift(1);
    }

    private static void arrayShift(int playTurn) {
        //TODO remove the accuser!
        String[] play = {"Zero", "One", "Two", "Three", "Four", "Five"};

        for (int i = playTurn; i < play.length-1; i++) {
            play[i] = play[i+1];

            Arrays.sort(play);
        }
        play[play.length-1] = null;

        for (String s : play) {
            System.out.println(s);
        }
    }
}


//
//1 2 3 4 5 6
//1 3 4 5 6