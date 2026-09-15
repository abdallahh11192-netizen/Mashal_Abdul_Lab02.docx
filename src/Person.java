import java.util.Objects;
import java.util.Calendar;
public class Person {
    private String firstName;
    /// 
    private String lastName;
    private String ID;
    private String title;
    private int YOB;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return YOB == person.YOB && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(ID, person.ID) && Objects.equals(title, person.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, ID, title, YOB);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID='" + ID + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public int getYOB() {
        return YOB;
    }

    public Person(String firstName, String lastName, String ID, String title, int YOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
        this.title = title;
        this.YOB = YOB;
    }
    /**
     * Returns the person's full name.
     *
     * @return the first name and last name separated by a space
     */
    public String fullName() {
        return firstName + " " + lastName;
    }

    /**
     * Returns the person's formal name.
     *
     * @return the title followed by the person's full name
     */
    public String formalName() {
        return title + " " + fullName();
    }
    /**
     * Returns the person's age based on the current year.
     *
     * @return the person's current age as a String
     */
    public String getAge() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return String.valueOf(currentYear - YOB);
    }

    /**
     * Returns the person's age for a specified year.
     *
     * @param year the year used to calculate the person's age
     * @return the person's age for the specified year as a String
     */
    public String getAge(int year) {
        return String.valueOf(year - YOB);
    }
    /**
     * Converts the person's data to CSV format.
     *
     * @return the person's data as a comma-separated String
     */
    public String toCSV() {
        return firstName + "," + lastName + "," + ID + "," + title + "," + YOB;
    }
    /**
     * Converts the person's data to JSON format.
     *
     * @return the person's data as a JSON formatted String
     */
    public String toJSON() {
        return "{\"firstName\":\"" + firstName +
                "\",\"lastName\":\"" + lastName +
                "\",\"ID\":\"" + ID +
                "\",\"title\":\"" + title +
                "\",\"YOB\":" + YOB + "}";
    }

    /**
     * Converts the person's data to XML format.
     *
     * @return the person's data as an XML formatted String
     */
    public String toXML() {
        return "<Person>" +
                "<firstName>" + firstName + "</firstName>" +
                "<lastName>" + lastName + "</lastName>" +
                "<ID>" + ID + "</ID>" +
                "<title>" + title + "</title>" +
                "<YOB>" + YOB + "</YOB>" +
                "</Person>";
    }
}
