package Introduction;

public class Main {
    public static void main(String[] args) {
        Student std = new Student(10,"rythem",90.4f);
        std.greet();
    }
}
class Student{
    int rno;
    String name;
    float marks;

    Student(){
        name = "";
        rno = 0;
        marks = 0.0f;
    }

    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    void greet(){
        System.out.println("Hello from " + this.name);
    }
}
