import java.util.ArrayList;
import java.util.List;

import model.Teacher;


public class TeacherService {
    private final List<Teacher> teachersList = new ArrayList<>();

    public TeacherService() {
    }

    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxID = 0;
        for (Teacher teacher : teachersList) {
            if (maxID < teacher.getTeacherID()) {
                maxID = teacher.getTeacherID();
            }

        }
        teachersList.add(new Teacher(++maxID,firstName, secondName, lastName));

    }
    public List<Teacher> getTeachersList() {
        return teachersList;
    }

}
