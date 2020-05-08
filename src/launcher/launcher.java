package launcher;

// encoding data by sex
/*
M --> 0
F --> 1
 */

import datamodel.Person;
import services.PersonCSVHandler;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class launcher {
    public static void main(String[] args) throws IOException {

        List<Person> readFromFile = PersonCSVHandler.readFromFile("persons.csv");

        Map<String, Integer> index = new LinkedHashMap<>();
        List<Person> indexedList = readFromFile.stream().peek(p -> {
            Integer currentValue = index.get(p.getSex());
            if (currentValue == null) {
                currentValue = index.size() + 1;
                index.put(p.getSex(), currentValue);
            }
            p.setIndexbySex(currentValue);
        }).collect(Collectors.toList());

        //System.out.println(indexedList);

        Integer[][] matrix = indexedList
                .stream()
                .map(p -> new Integer[]{p.getIndexbySex(), p.getAge(),
                        p.getHeight(), p.getWeight()})
                .collect(Collectors.toList())
                .toArray(new Integer[0][]);
        //System.out.println(numericalList);



        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        //DONE reconstruct back the list of person from the double matrix
        List<Person> output = new ArrayList<>();
        for(Integer[] row : matrix) {
            Person foundPerson = readFromFile
                    .stream()
                    .filter(person ->
                        person.getSex().equals(row[0] == 1 ? "M" : "F")
                            && person.getAge().equals(row[1])
                            && person.getHeight().equals(row[2])
                            && person.getWeight().equals(row[3])
                     )
                    .findAny()
                    .get();
            output.add(foundPerson);
            //System.out.println(foundPerson);
        }
        System.out.println(output);


        //BLOCK END

    }

    private static String resolvedByValue(Map<String, Integer> map, Integer integer) {
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue().equals(integer)) {
                return entry.getKey();
            }
        }

        return null;
    }
}
