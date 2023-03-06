
// application team in UTP
import java.util.*;
public class Main
{

    // application code
    public static void main(String[] args) {
        System.out.println("WELCOME TO PANDAI SDN BHD!");

        Student aliah = new Student();
        Name name = new Name();
        name.setFName("Aliah");
        name.setMName("binti");
        name.setLName("Razak");
        aliah.setName(name);

        System.out.println("---Aliah's Marks---");
        try {  // try block.. something in here can cause exception
            aliah.setMark(10, 0);
            aliah.setMark(20, 1);
            aliah.setMark(40, 2);
            aliah.setMark(60, 3);
            aliah.setMark(70, 4);
        } catch (Exception ex) {  // catch block.. action to be taken
            // in case of Exception
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }
        aliah.displayMarks();
        System.out.println("----Calculations----");
        // calculate and print the avg for aliah
        System.out.println("Avg mark for Aliah is " + aliah.calcAvg());
        // calculate the min and max marks for aliah
        System.out.println("Min mark for Aliah is " + aliah.calcMin());
        System.out.println("Max mark for Aliah is " + aliah.calcMax());

        Student adila = new Student();
        name = new Name();
        name.setFName("Adila");
        name.setMName("binti");
        name.setLName("Izzat");
        adila.setName(name);

        //  System.out.println("Adila's Marks:");
        try {  // try block.. something in here can cause exception
            adila.setMark(80, 0);
            adila.setMark(50, 1);
            adila.setMark(60, 2);
            adila.setMark(60, 3);
            adila.setMark(70, 4);
        } catch (Exception ex) {  // catch block.. action to be taken
            // in case of Exception
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }
        // adila.displayMarks();
        // calculate and print the avg for aliah
        // System.out.println("Avg mark for Adila is " + adila.calcAvg());
        // // calculate the min marks for aliah
        // System.out.println("Min mark for Adila is " + adila.calcMin());     

        Student imran = new Student();
        name = new Name();
        name.setFName("Syed");
        name.setLName("Imran");
        imran.setName(name);

        //  System.out.println("Imran's Marks:");
        try {  // try block.. something in here can cause exception
            imran.setMark(10, 0);
            imran.setMark(20, 1);
            imran.setMark(40, 2);
            imran.setMark(60, 3);
            imran.setMark(70, 4);
        } catch (Exception ex) {  // catch block.. action to be taken
            // in case of Exception
            System.out.println("Cannot continue");
            ex.printStackTrace();
        }
        // imran.displayMarks();

        // creating a batch object
        StudentBatch sb2023 = new StudentBatch();
        sb2023.add(aliah, 0);
        sb2023.add(adila, 1);
        sb2023.add(imran, 2);


        boolean findName = sb2023.find("Imran");
        System.out.println(findName);

        TuitionCenter center1 = new TuitionCenter("KL001", "Ku Hakim");
        // Add some students and tutors to the center
        center1.addStudent(aliah);
        center1.addStudent(adila);

        Teacher teacher1 = new Teacher("Amar", "987654321","Degree in Mathematics", "34, Jln Tengku",  5);
        Teacher teacher2 = new Teacher("Alexander", "123456789", "Degree in Science","78, Taman Alam",  3);

        center1.addTeacher(teacher1);
        center1.addTeacher(teacher2);



        System.out.println("The background of the tutors at " + center1.centerName() + ":" +"\n"+ center1.getTeachersBackground());
        System.out.println(center1.getNumberOfStudents() + " students are enrolled in " + center1.centerName());
        System.out.println(center1.getNumberOfTeachers() + " teachers work at " + center1.centerName());
    }
}
