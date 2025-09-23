import java.util.ArrayList;
import java.util.Scanner;

class Student{
    int id;
    String name;
    int marks;

    Student(int id,String name,int marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", marks=").append(marks);
        sb.append('}');
        return sb.toString();
    }
}
public class task2 {
    private static ArrayList<Student> student = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Welcome to student record management system!!");
        int choice;
        do{
            System.out.println("To Add student PRESS 1");
            System.out.println("To View students PRESS 2");
            System.out.println("To Update student PRESS 3");
            System.out.println("To Delete student PRESS 4");
            System.out.println("To Exit PRESS 5");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            switch(choice){
                case 1:addStudent();break;
                case 2:viewStudent();break;
                case 3:updateStudent();break;
                case 4:deleteStudent();break;
                case 5:System.out.println("Exiting...");break;
                default:System.out.println("Invalid choice entered!!");
            }
        }
        while(choice!=5);
    }

    public static void addStudent(){
        System.out.print("Enter id: ");
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter marks: ");
        int marks = input.nextInt();
        student.add(new Student(id,name,marks));
        System.out.println("Student successfully added!!");
    }

    public static void viewStudent(){
        if(student.isEmpty()){
            System.out.println("No student data available!!");
        }
        else{
            for(Student s:student){
                System.out.println(s);
            }
        }
    }

    public static void updateStudent(){
        System.out.print("Input student id to update: ");
        int id = input.nextInt();
        for(Student s:student){
            if(s.id==id){
                input.nextLine();
                System.out.print("Enter new Name: ");
                s.name = input.nextLine();
                System.out.print("Enter new Marks: ");
                s.marks = input.nextInt();
                System.out.println("Student Updated!!");
                return;
            }
        }
        System.out.println("Student not found!!");
    }

    public static void deleteStudent(){
        System.out.println("Input student id to delete: ");
        int id = input.nextInt();
        for(Student s:student){
            if(s.id==id){
                student.remove(s);
                System.out.println("Student Deleted!!");
                return;
            }
        }
        System.out.println("Student not found!!");
    }
}
