/**
 * Created by vlad on 13.09.16.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person m1 = new Person(true, "M1");
        Person m2 = new Person(true, "M2");

        Person w1 = new Person(false, "W1");
        Person w2 = new Person(false, "W2");

        System.out.println(m1.marry(m2));
        System.out.println(m1.marry(w1));
        System.out.println("-----------");

        System.out.println(m2.marry(m2));
        System.out.println(m2.marry(m1));
        System.out.println(m2.marry(w2));
        System.out.println("-----------");

        System.out.println(m1.marry(w2));
        System.out.println(m2.divorce());
        System.out.println(w1.divorce());
        System.out.println(m1.divorce());
        System.out.println(w2.divorce());
        System.out.println("-----------");


    }
}
