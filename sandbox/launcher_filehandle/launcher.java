package launcher_filehandle;
import datamodel.Person;
import services.PersonCSVHandler;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;


public class launcher {

    private static final String FILE_LOCATION = "personsTest.csv";

    public static void main(String[] args) throws IOException {
        List<Person> persons = PersonCSVHandler.readFromFile(FILE_LOCATION);

        System.out.println("\n1. Average calculated by map and reduce");
        CalculateAverageAge(persons);

        System.out.println("\n2. Calculation of Median of Feature Age");
        CalculateMedian(persons);

        System.out.println("\n3. Calculation of Deciles for Feature Age");
        CalculateDeciles(persons);

        System.out.println("\n4. Group person based on gender");
        //GroupByGender(persons);
        List<Person> groupBySexList = groupBySex(persons);

    }

    public static void GroupByGender(List<Person> persons) {
        List<Object> male = new ArrayList<>();  // create a separate list for males and females
        List<Object> female = new ArrayList<>();
        String ref = persons.get(0).getSex();   // reference for comparison and grouping in for loop

        for (int i = 0; i < persons.size(); i++){
            String sex = persons.get(i).getSex();
            if (sex.equals(ref)){
                male.add(String.valueOf(persons.get(i)));
            } else {
                female.add(String.valueOf(persons.get(i)));
            }
        }
        System.out.println(male);
        System.out.println(female);
    }


    public static void CalculateDeciles(List<Person> persons) {
        // Decile(i) = i * ((n+1)/10)
        int n = persons.size();                         // Size of provided list
        List<Integer> ages = new ArrayList<>();

        for (int i = 0; i < n; i++){
            ages.add(persons.get(i).getAge());          //creating separate list for age
        }
        Collections.sort(ages);
        List<Double> Deciles = new ArrayList<>();

        double tenthData = (double) (n + 1) / 10;       // value of (n+1)/10

        for (int i = 1; i <= 9; i++){
            double decile = i*tenthData;                //Value of D(i)
            int position = (int) decile - 1;            // Index of element in list for which D(i) lies

            /* pos(n)
                    + (difference between pos(n) and decile value)
                    * (difference between pos(n+1) and pos(n))
            */
            Double value = ages.get(position)
                    + ((decile - (int) decile)
                    * (ages.get(position+1) - ages.get(position)));
            Deciles.add(value);
        }
        System.out.println(Deciles);
    }


    public static void CalculateMedian(List<Person> persons) {
        int size = persons.size();          // length of provided data list
        List<Integer> ages = new ArrayList<>();

        for (int i =0; i < size; i++){
            ages.add(persons.get(i).getAge());
        }

        Collections.sort(ages);
        double median = ((double) size + 1) / 2;    // {(n+1)/2} th position in list

        if (((int) median == median)){
            Integer medianAge = ages.get((int) median -1);
            System.out.println(medianAge);
        } else{
            Double medianAge = (Double.valueOf(ages.get((int) median -1))
                    + Double.valueOf(ages.get((int) median))) / 2;
            System.out.println(medianAge);
        }
    }


    public static void CalculateAverageAge(List<Person> persons) {
        int ageSum = 0;
        for (Person person: persons){
            ageSum = ageSum + person.getAge();
        }
        int size = persons.size();
        double averageAge = (double) ageSum / (double) size;

        int AverageAgeAsInt = ageSum / persons.size();

        System.out.println("AverageAge :" + averageAge);
        System.out.println("AverageAge in Int:" + AverageAgeAsInt);
    }

    public static List<Person> groupBySex(List<Person> persons){

        Map<String, List<Person>> mapBySex = persons.stream().collect(Collectors.groupingBy(Person::getSex));
        persons.sort((p1,p2) -> p1.getAge().compareTo(p2.getAge()));

        /*
        //with annonyms comparter implmntn
        persons.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
         */
        return persons;
    }
}

