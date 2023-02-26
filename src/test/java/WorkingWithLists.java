import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public WorkingWithLists() {
    }

    @Test
    public void createAndWorlWithLists() {
        Student valera = new Student();
        valera.setFirstName("Valera");
        valera.setLastName("Ivanov");
        valera.setEmail("val@gmail.com");
        valera.setPhone("2344567899");


        Student lida = new Student("Lida", "Inova", "liga@gmail.com", "56788976543466");
        Student kate = new Student("Kate", "Zafarova", "kate@gmail.com", "7896547078687");
        Student vlad = new Student("Vlad", "Petersson", "null", "789543567");

        List<Student> students = new ArrayList<>();
        students.add(valera);
        students.add(lida);
        students.add(kate);
        students.add(vlad);

//--------------------------------FOR-------------------------------------------
        for (int i = 0; i < 2; i++) {
            System.out.println(students.get(i).getFirstName());
        }
//------------------------------FOREACH------------------------------------------


        for (Student s : students) {
            //  System.out.println(s.getLastName() + " " + s.getEmail());
            System.out.println(s.getFullName());
        }
//--------------------------ForEACH with IF -------------------
        System.out.println("Printing students with phone nr starting with 789:");
        for (Student s : students) {
             if (s.getPhone().startsWith("789")) {
                 System.out.println(s.getFullName());
            }
        }
    }

}