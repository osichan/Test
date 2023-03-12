import lviv.lpnu.iot.test.Lector;
import lviv.lpnu.iot.test.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Students");
        List<Object> listOfStudents = new ArrayList<>();
        listOfStudents.add(new Student("Oskar","Saienko"));
        listOfStudents.add(new Student("Oleksandr","Sobran"));
        System.out.println(listOfStudents);
        System.out.println("\n Lectors");
        List<Lector> listOfLectors = new ArrayList<Lector>();
        listOfLectors.add(new Lector("Zenyk","Veres"));
        System.out.println(listOfLectors);
    }
}