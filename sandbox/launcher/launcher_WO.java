package launcher;

import datamodel.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class launcher_WO {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("personsTest.csv");
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        PrintStream prs = new PrintStream(fileOutputStream);

        // print content of a person

        Person person = new Person();
        person.setAge(30);
        person.setSex("F");
        person.setHeight(75);
        person.setWeight(50);
        person.setName("Karen");
        prs.println("\"Name\", \"Age\", \"Sex\", \"Height\", \"Weight\"");
        prs.println(person.getName()+ ',');
        prs.print(person.getAge()+',');
        prs.print(person.getSex()+ ',');
        prs.print(person.getHeight()+ ',');
        prs.print(person.getWeight());

        //prs.println("test");
        prs.flush();
        prs.close();
    }
}
