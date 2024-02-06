public class Teacher extends User {
    private int teacherID;

    public Teacher(int teacherID,String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.teacherID = teacherID;

    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }
    @Override
    public String toString() { 
        return "Учитель [Id=" + teacherID + ", Имя " + super.getFirstName() + ", Отчество " + super.getSecondName()
                + ", Фамилия " + super.getLastName() + "]";
    }

}
