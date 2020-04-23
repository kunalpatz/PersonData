# Author
Kunal PATIL

# PersonData
Sample exercise to create read datamodel.person information.

1. Creation of a launcher class that is able to create five instances of the datamodel.person class and display their characteristics in the console.

## Sample Output:

```java
Alex is Male,Aged 41, with height 74in and weight 170 lbs
Bert is Male,Aged 42, with height 68in and weight 166 lbs
Carl is Male,Aged 32, with height 70in and weight 155 lbs
Dave is Male,Aged 39, with height 72in and weight 167 lbs
Elly is Female,Aged 30, with height 66in and weight 124 lbs
```

2. Creation of launcher class for:
    1. To calculate Average of age feature values
    2. To calculate Median of Feature Age values
    3. To calculate Decile values (9th) for Feature Age values
    4. To group person based on Gender

```java
1. Average calculated by map and reduce
AverageAge :34.666666666666664
AverageAge in Int:34

2. Calculation of Median of Feature Age
32.5

3. Calculation of Deciles for Feature Age
[25.7, 28.8, 30.0, 31.6, 32.5, 34.8, 38.3, 41.2, 47.59999999999999]

4. Group person based on gender
[Person [name="Alex", sex= "M", age=41, height=74, weight=170], Person [name="Bert", sex= "M", age=42, height=68, weight=166], Person [name="Carl", sex= "M", age=32, height=70, weight=155], Person [name="Dave", sex= "M", age=39, height=72, weight=167], Person [name="Hank", sex= "M", age=30, height=71, weight=158], Person [name="Ivan", sex= "M", age=53, height=72, weight=175], Person [name="Jake", sex= "M", age=32, height=69, weight=143], Person [name="Luke", sex= "M", age=34, height=72, weight=163], Person [name="Neil", sex= "M", age=36, height=75, weight=160], Person [name="Omar", sex= "M", age=38, height=70, weight=145], Person [name="Quin", sex= "M", age=29, height=71, weight=176]]
[Person [name="Elly", sex= "F", age=30, height=66, weight=124], Person [name="Fran", sex= "F", age=33, height=66, weight=115], Person [name="Gwen", sex= "F", age=26, height=64, weight=121], Person [name="Kate", sex= "F", age=47, height=69, weight=139], Person [name="Myra", sex= "F", age=23, height=62, weight=98], Person [name="Page", sex= "F", age=31, height=67, weight=135], Person [name="Ruth", sex= "F", age=28, height=65, weight=131]]

```


