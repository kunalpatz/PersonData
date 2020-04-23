package launcher;

import datamodel.Person;

import java.util.ArrayList;

public class launcher {
    public static void main(String[] args) {
        Person data = new Person();
        ArrayList<ArrayList<Object>> personData = new ArrayList<ArrayList<Object>>(5);

        ArrayList<Object> person1 = new ArrayList<Object>();
        person1.add("Alex");
        person1.add("M");
        person1.add(41);
        person1.add(74);
        person1.add(170);
        personData.add(person1);
        ArrayList<Object> person2 = new ArrayList<Object>();
        person2.add("Bert");
        person2.add("M");
        person2.add(42);
        person2.add(68);
        person2.add(166);
        personData.add(person2);
        ArrayList<Object> person3 = new ArrayList<Object>();
        person3.add("Carl");
        person3.add("M");
        person3.add(32);
        person3.add(70);
        person3.add(155);
        personData.add(person3);
        ArrayList<Object> person4 = new ArrayList<Object>();
        person4.add("Dave");
        person4.add("M");
        person4.add(39);
        person4.add(72);
        person4.add(167);
        personData.add(person4);
        ArrayList<Object> person5 = new ArrayList<Object>();
        person5.add("Elly");
        person5.add("F");
        person5.add(30);
        person5.add(66);
        person5.add(124);
        personData.add(person5);

        for (int len = 0; len < personData.size(); len++) {
            data.setName(personData.get(len).get(0).toString());
            data.setSex(personData.get(len).get(1).toString());
            data.setAge((int) personData.get(len).get(2));
            data.setHeight((int) personData.get(len).get(3));
            data.setWeight((int) personData.get(len).get(4));

            System.out.println(data.getName() + " is " + data.getSex() + ",Aged " +
                    data.getAge() + ", with height " + data.getHeight() + "in and weight " + data.getWeight() + " lbs");
        }
    }

}
