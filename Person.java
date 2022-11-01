package FamilyTree;

public class Person {
    public String fullName;
    public Integer age;

    public Person(String fullName, Integer age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getAge() {
        return age;
    }

}