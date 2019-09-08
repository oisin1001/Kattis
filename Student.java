public class Student{
    private String name;
    private String id;
    private String programme;

    Student(String nm, String ID, String prog){
        name = nm;
        id = ID;
        programme = prog;
    }

    public void display(){
        System.out.println("Name:\t\t" + name);
        System.out.println("I.D.:\t\t" + id);
        System.out.println("Programme:\t" + programme);
    }

    static int countlower = 0;

    public static int lowerCount(String str) {
        int val = (int)str.charAt(0);

        if (str.equals("")) {
            return countlower;
        }
        if(val >= 97 && val <= 122) {
            countlower++;
        }
        return lowerCount(str.substring(1, str.length()));
    }

    public static class Main{
        public static void main(String[] args) {
            //Student s1 = new Student("Aodhagan Watters","16345426", "ME2");
           // s1.display();
            System.out.println(lowerCount("Hello"));
        }
    }
}