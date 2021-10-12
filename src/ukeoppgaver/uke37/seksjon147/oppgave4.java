package ukeoppgaver.uke37.seksjon147;

import datastrukturer.Tabell;
import eksempelklasser.Komporator;
import eksempelklasser.Person;

import java.util.Arrays;

public class oppgave4 {
    public static void main(String... args)
    {
        Person[] p = new Person[5];                       // en persontabell
        p[0] = new Person("Kari", "Svendsen");            // Kari Svendsen
        p[1] = new Person("Boris", "Zukanovic");          // Boris Zukanovic
        p[2] = new Person("Ali", "Kahn");                 // Ali Kahn
        p[3] = new Person("Azra", "Zukanovic");           // Azra Zukanovic
        p[4] = new Person("Kari", "Pettersen");           // Kari Pettersen


        Tabell.innsettingssortering(p, Komporator.Komparator.orden(Person::etternavn));                // se Programkode 1.4.6 b)

        System.out.println(Arrays.toString(p));           // Utskrift av tabellen p
        // [Ali Kahn, Azra Zukanovic, Boris Zukanovic, Kari Svendsen, Kari Pettersen]
    }
}
