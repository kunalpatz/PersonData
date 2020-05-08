package services;

import datamodel.Person;

import java.util.Comparator;
// Compares its two args for order

public class PersonAgeComparator implements Comparator<Person> {
    public int compare (Person o1, Person o2) {
        return o1.getAge().compareTo(o2.getAge());
    }
}
