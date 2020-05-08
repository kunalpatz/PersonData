package services;
import datamodel.Person;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonCSVHandler {

    public static List<Person> readFromFile(String fileLocation) throws IOException {

        List<String> rawPersons = Files.readAllLines(new File(fileLocation).toPath());

        for (String line : rawPersons) {
            System.out.println(line);
        }
        rawPersons.remove(0);
        //System.out.println("after removal");
        //System.out.println();
        List<Person> persons = new ArrayList<>();
        for (String line : rawPersons) {
            //System.out.println(line);
            String[] parts = line.split(",");
            //System.out.println(Arrays.asList(parts));
            Person person = new Person();
            person.setName(parts[0]);
            person.setSex(parts[1].substring(2,3));
            person.setAge(Integer.valueOf(parts[2].strip()));
            person.setHeight(Integer.valueOf(parts[3].strip()));
            person.setWeight(Integer.valueOf(parts[4].strip()));
            persons.add(person);

        }
        return persons;
    }

    public static List<Person> writeToFile(String fileLocation) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream(fileLocation, false);
        PrintStream prs = new PrintStream(fileOutputStream);

        // print content of a person

        Person person = new Person();
        return null;
    }

}
