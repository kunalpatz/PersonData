package datamodel;

public class Person {
    private String name;
    private String sex;
    private Integer indexbySex;
    private Integer age;
    private Integer height;
    private Integer weight;

    public Integer getIndexbySex() {
        return indexbySex;
    }

    public void setIndexbySex(Integer indexbySex) {
        this.indexbySex = indexbySex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String toString() {
        return "Person [name=" + name + ", sex=" + sex + ", index=" + indexbySex + ", age=" + age + ", height=" + height + ", weight=" + weight
                + "]";
    }
}
