import model.Teacher;
import service.TeacherService;
import view.TeacherView;


public class TeacherControler implements UserControler<Teacher> {
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String lastName) {
        teacherService.create(firstName, secondName, lastName);

    }

    @Override
    public void sendOnConsole() {

        teacherView.sendOnConsole(teacherService.getTeachersList());
    }

}
