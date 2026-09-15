import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person person;

    @BeforeEach
    void setUp() {
        person = new Person("John", "Doe", "000001", "Mr.", 2000);
    }

    @Test
    void testConstructor() {
        Person testPerson = new Person("Jane", "Smith", "000002", "Dr.", 1995);

        assertEquals("Jane", testPerson.getFirstName());
        assertEquals("Smith", testPerson.getLastName());
        assertEquals("000002", testPerson.getID());
        assertEquals("Dr.", testPerson.getTitle());
        assertEquals(1995, testPerson.getYOB());
    }

    @Test
    void testEquals() {
        Person person2 = new Person("John", "Doe", "000001", "Mr.", 2000);
        assertEquals(person, person2);
    }

    @Test
    void testHashCode() {
        Person person2 = new Person("John", "Doe", "000001", "Mr.", 2000);
        assertEquals(person.hashCode(), person2.hashCode());
    }

    @Test
    void testToString() {
        String expected = "Person{firstName='John', lastName='Doe', ID='000001', title='Mr.', YOB=2000}";
        assertEquals(expected, person.toString());
    }

    @Test
    void setFirstName() {
        person.setFirstName("Mike");
        assertEquals("Mike", person.getFirstName());
    }

    @Test
    void setLastName() {
        person.setLastName("Johnson");
        assertEquals("Johnson", person.getLastName());
    }

    @Test
    void setTitle() {
        person.setTitle("Dr.");
        assertEquals("Dr.", person.getTitle());
    }

    @Test
    void setYOB() {
        person.setYOB(1998);
        assertEquals(1998, person.getYOB());
    }

    @Test
    void fullName() {
        assertEquals("John Doe", person.fullName());
    }

    @Test
    void formalName() {
        assertEquals("Mr. John Doe", person.formalName());
    }

    @Test
    void getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        String expected = String.valueOf(currentYear - 2000);

        assertEquals(expected, person.getAge());
    }

    @Test
    void testGetAge() {
        assertEquals("25", person.getAge(2025));
    }

    @Test
    void toCSV() {
        String expected = "John,Doe,000001,Mr.,2000";
        assertEquals(expected, person.toCSV());
    }

    @Test
    void toJSON() {
        String expected =
                "{\"firstName\":\"John\",\"lastName\":\"Doe\",\"ID\":\"000001\",\"title\":\"Mr.\",\"YOB\":2000}";

        assertEquals(expected, person.toJSON());
    }

    @Test
    void toXML() {
        String expected =
                "<Person><firstName>John</firstName><lastName>Doe</lastName><ID>000001</ID><title>Mr.</title><YOB>2000</YOB></Person>";

        assertEquals(expected, person.toXML());
    }
}