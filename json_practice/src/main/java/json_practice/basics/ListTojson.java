package json_practice.basics;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class Student {
    public String name;
    public int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


public class ListTojson {
    public static void main(String[] args) throws Exception {

        List<Student> students = List.of(
                new Student("Riddhi", 23),
                new Student("Surya", 26)
        );

        ObjectMapper mapper = new ObjectMapper();
        String jsonArray = mapper.writeValueAsString(students);

        System.out.println(jsonArray);
    }
}
