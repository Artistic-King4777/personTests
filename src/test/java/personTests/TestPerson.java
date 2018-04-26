package personTests;

import org.junit.Assert;
import org.junit.Test;
import personMaker.Person;

public class TestPerson {

    // TODO - USE EXPECTED AND ACTUAL IN YOUR ASSERT

//    @Test

    @Test
    public void testDefaultConstructor() {
        // Given

        Person person = new Person();

        // When (not null)


        // Then
      Assert.assertNotNull(person);
    }

    @Test
    public void constructorWithNameTest() {

        // Given
        String expected = "Porter 'Shelter' Robinson";
        Person person = new Person("Porter 'Shelter' Robinson");

        // When
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void constructorWithAgeTest() {

        // Given
        int expected = 8;
        Person person = new Person(8);

        // When
        int actual = person.getAge();

        // Then
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void constructorWithNameAndAgeTest() {

        // Given
        String expectedName = "Porter 'Shelter' Robinson";
        int expectedAge = 8;
        Person person = new Person("Porter 'Shelter' Robinson", 8);

        // When
        String actualName = person.getName();
        int actualAge = person.getAge();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void setNameTest() {

        // Given
        Person person = new Person();
        String expected = "Satomi Yuzuru";

        // When
        person.setName("Satomi Yuzuru");
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setAgeTest() {

        // Given
        Person person = new Person();
        int expected = 21;

        // When
        person.setAge(21);
        int actual = person.getAge();

        // Then
        Assert.assertEquals(expected, actual);
    }

}
