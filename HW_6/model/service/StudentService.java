import java.util.ArrayList;
import java.util.List;

import model.Student;


public class StudentService {
    private final List<Student> studentList = new ArrayList<>();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        double rating;
        // Characteristic characteristic = new Charac;
        rating = Math.random() * 3 + 2;

        int maxID = 0;
        for (Student student : studentList) {
            if (maxID < student.getStudentId()) {
                maxID = student.getStudentId();
            }

        }
        studentList.add(new Student(++maxID, firstName, secondName, lastName, rating));

    }

    public List<Student> getStudentList() {
        return studentList;
    }


}
