package Superpowers;

import java.time.LocalDate;

public class MainTester
{
    public static void main(String[] args)
    {
        SuperHuman s = new SuperHuman("Mr.MuffinMan", Affiliation.GOOD, "Flying Muffins", "Whippy Dippy I got some muffins inna jiffy!");

        System.out.println(s.catchPhrase());
        System.out.println(s.usePower());

        Human h = new Human("Aaron Allen", LocalDate.ofYearDay(2001, 10), "male", "Java's full time husband");
        System.out.println(h.getOccupation());
        System.out.println(h.getName());
    }
}
