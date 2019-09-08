public class Agoon {
    static int countlower = 0;

    public static int lowerCount(String str) {
        if (str.equals("")) {
            return countlower;
        }

        int val = (int)str.charAt(0);
        if(val >= 97 && val <= 122) {
            countlower++;
        }

        return lowerCount(str.substring(1, str.length()));
    }

    public static void main(String[] args) {
        System.out.println(lowerCount("hellob"));
    }
}