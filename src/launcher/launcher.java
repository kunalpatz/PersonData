package launcher;
import datamodel.person;
import services.PersonCSVHandler;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class launcher {

    //private static final String FILE_LOCATION = "persons.csv";

    public static void main(String[] args) throws IOException {
        //List<String> rawPersons = Files.readAllLines(new File("src/persons.csv").toPath());
        List<person> persons = PersonCSVHandler.readFromFile("persons.csv");
        //System.out.println(persons);

        System.out.println("average calculated by map and reduce (functnl API)");
        calculateAverageage(persons);

        OptionalDouble averageAge = persons.stream()
                .mapToInt(person::getAge)
                .average();

        System.out.println(averageAge.getAsDouble());
    }

    public static void calculateAverageage(List<person> persons) {
        // Only got age average
        Integer ageSum = 0;
        for (person Person: persons){
            ageSum = ageSum + Person.getAge();
        }
        int size = persons.size();
        Double averageAge = Double.valueOf(ageSum) / Double.valueOf(size);

        int AverageAgeAsInt = ageSum / persons.size();

        //System.out.println("AverageAge :" + averageAge);
        //System.out.println("AverageAge in Int:" + AverageAgeAsInt);
        //loops(rawPersons);
        //Person person = new Person();

    }

    public static void loops(List<String> rawPersons) {

        //Loops//

        //While loop
        int i =0;
        while (i < rawPersons.size()){
            System.out.println(rawPersons.get(i));
            i++;
        }
        // Do while loop
        int j =0;
        do {
            System.out.println(rawPersons.get(j));
            j++;
        } while (j > rawPersons.size());

        // For loop

        for (int k = 0; k< getSize(rawPersons); k++){
            System.out.println(rawPersons.get(k));
        }

        // For each loop
        for (String line: rawPersons){
            System.out.println(line);
        }
    }

    private static int getSize(List<String> rawPersons) {
        return rawPersons.size();
    }
}

