/**
 * Created by vlad on 13.09.16.
 */
public class Person {
    private final boolean man;
    private final String name;
    private Person spouse;


    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    public boolean marry(Person person) {

        if (man != person.man && person != spouse) {
            divorce();
            person.divorce();
            spouse = person;
            person.spouse = this;
            return true;
        } else {
            return false;
        }

    }

    public boolean divorce() {
        if (spouse != null) {
            spouse.spouse = null;
            spouse = null;
            return true;
        } else {
            return false;
        }
    }
}
