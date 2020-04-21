package services;
import datamodel.person;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonCSVHandler {

    public static List<person> readFromFile(String fileLocation) throws IOException {

        List<String> rawPersons = Files.readAllLines(new File(fileLocation).toPath());

        for (String line : rawPersons) {
            //System.out.println(line);
        }
        rawPersons.remove(0);
        //System.out.println("after removal");
        //System.out.println();
        List<person> persons= new ArrayList<>();
        for (String line : rawPersons) {
            //System.out.println(line);
            String[] parts = line.split(",");
            //System.out.println(Arrays.asList(parts));


            person Person = new person();
            Person.setName(parts[0]);
            Person.setSex(parts[1]);
            Person.setAge(Integer.valueOf(parts[2].strip()));
            Person.setHeight(Integer.valueOf(parts[3].strip()));
            Person.setWeight(Integer.valueOf(parts[4].strip()));
            persons.add(Person);

            //System.out.println(persons);
        }
        return persons;
    }
}
