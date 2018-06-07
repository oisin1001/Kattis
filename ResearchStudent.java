public class ResearchStudent extends Student {
    private String supervisor;
    private String ThesisTitle;

    ResearchStudent(String nm, String ID, String prog, String sv, String tt){
        super(nm, ID, prog);
        supervisor = sv;
        ThesisTitle = tt;
    }


    public void display(){
        super.display();
        System.out.println("Supervisor:\t" + supervisor);
        System.out.println("Thesis Title:\t" + ThesisTitle);
    }


    public static void main(String[] args) {
//        Student s1 = new Student("Aodhagan Watters","16345426", "ME2");
//        ResearchStudent sr1 = new ResearchStudent("Q Dawg","16345426", "CS", "C McArdle", "Homework 5");
//        s1.display();
//        System.out.println();
//        sr1.display();
    }
}