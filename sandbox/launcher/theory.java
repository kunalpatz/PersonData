
//Map(Integer, List<Person> > map); ###deciles


// To update value in Dictionary for any key

//Map(Integer, List<Person> > map) = new LinkedHashMap<Integer>, List<Person>();
// List<Person> decileList = map.get(1);

//if (decileList == null){
// decileList = new ArrayList<Person>();
// map.put(1, decileList);
//}


//map.get(1).add(persons.get(1));


/* For java > 8 versions
Map<String, List<Person>> mapBySex = persons.stream().collect(Collectors.groupingBy(Person::getSex))
 */

// map we have to add return
// peek we dont need to return it will operate on original
