import java.util.Iterator;
import java.util.List;

import model.Student;


public class StudentGroupIterator implements Iterator<Student> { // класс для переборки группы со студентами реализует интерфейс итератор (<Student>
    // -элемент каждой итерации)
    private List<Student> studentList; // будем хранить список со студентами
    private int counter; // переменная для хранения номера текущей итерации

    public StudentGroupIterator(StudentGroup studentGroup) { // конструктор принимает группу студентов а не список со студентами
        this.studentList = studentGroup.getStudentList(); // здесь хранится список студентов из этой группы
        counter = 0;
    }

    @Override
    public boolean hasNext() { // обязательный  имплементированный метод итератора проверяет есть ли следующий элемент
        
        return counter < studentList.size(); // проверяет есть ли следующий элемент в списке
    }

    @Override
    public Student next() { // обязательный имплементированный метод итератора возвращает следующий элемент
        if (hasNext()) {
            return studentList.get(counter++); //вернет элемент и увеличит счетчик
                
        }
        
        return null;
    }

    @Override
    public void remove() { // удаляет следующий элемент
        if(hasNext()){
            studentList.remove(counter);
        }
        
        
    }
    

    
}
