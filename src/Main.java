import com.bootcamp.*;

public class Main {

    public static void main(String[] args) {
        int i = 124324234;
        Integer idNumber;
        Student student = new Student("Ron","Tropia",12345,"Computer Science");
        Person person = new Student("Siena","Abaya",12345,"Computer Science");

        if(student == person && student == null){

        }

        System.out.println(student instanceof Student);
        System.out.println(person instanceof Person);
        System.out.println(person.getFullName());
        System.out.println(((Person) student).getFullName());
        System.out.println(student.toString(" 1"));

    }
}
