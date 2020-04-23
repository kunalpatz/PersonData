package launcher;

import datamodel.Person;
import services.PersonCSVHandler;

import java.io.IOException;
import java.util.List;
import java.util.OptionalDouble;


public class launcher_demo {

    private static final String FILE_LOCATION = "persons.csv";

    public static void main(String[] args) throws IOException {
        //List<String> rawPersons = Files.readAllLines(new File("src/persons.csv").toPath());
        List<Person> persons = PersonCSVHandler.readFromFile(FILE_LOCATION);

        //Functional API

        System.out.println("Average calculated by map and reduce");
        //CalculateAverageAge(persons);

        OptionalDouble averageAge = persons.stream()
                .mapToInt(Person::getAge)
                .average();

        System.out.println(averageAge.getAsDouble());
    }

    public static void CalculateAverageAge(List<Person> persons) {
        // Only got age average
        Integer ageSum = 0;
        for (Person person: persons){
            ageSum = ageSum + person.getAge();
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

