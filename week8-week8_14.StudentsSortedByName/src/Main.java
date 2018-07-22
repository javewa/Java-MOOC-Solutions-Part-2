import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {

    
    public static void main(String[] args){
        List<Student> students = new ArrayList<Student>();
        Student first = new Student("jamo");
        students.add(first);
        Student second = new Student("jamo1");
        students.add(second);
        Student third = new Student("Rob");
        students.add(third);
        System.out.println(students);
        System.out.println(first.compareTo(second));
        Collections.sort(students);
        System.out.println(students);
        
    }
}
