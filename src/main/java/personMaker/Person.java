package personMaker;

public class Person {


    private String name;
    private int age;


    // TODO - CONSTRUCTORS

    // DefaultConstructorTest
    public Person() {
    }



    // ConstructorWithNameTest
    public Person(String name) {
        this.name = name;
    }

    // ConstructorWithAgeTest
    public Person(int age) {
        this.age = age;
    }

    // ConstructorWithNameAndAgeTEst
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }



    // TODO ------ Setters and getters

    // setNameTest
    public void setName(String name) {
        this.name = name;
    }


    // setAgeTest
    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public Integer getAge() {
        return age;
    }

}
