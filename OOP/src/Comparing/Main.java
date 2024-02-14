package Comparing;

public class Main {
    public static void main(String[] args) {
        Student Rythem = new Student(12,90.01f);
        Student Lex = new Student(5,87.7f);

        if(Rythem.compareTo(Lex)>0){
            System.out.println("Rythem has more marks");
        }
    }
}
