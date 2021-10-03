package ukeoppgaver.uke37.seksjon144;

import datastrukturer.Tabell;
import eksempelklasser.Person;

import java.util.Arrays;

public class oppgave2 {
    public static void main(String[] args) {
        Person[] p = new Person[7];                   // en persontabell

        p[0] = new Person("Kari","Svendsen");         // Kari Svendsen
        p[1] = new Person("Boris","Zukanovic");       // Boris Zukanovic
        p[2] = new Person("Ali","Kahn");              // Ali Kahn
        p[3] = new Person("Azra","Zukanovic");        // Azra Zukanovic
        p[4] = new Person("Kari","Pettersen");         // Kari Pettersen
        p[5] = new Person("Zineb", "Baazi");
        p[6] = new Person("Amina", "Baazi");

        int m = Tabell.maks(p);                       // posisjonen til den største
        System.out.println(p[m] + " er størst");      // skriver ut den største

        //Tabell.innsettingssortering(p);               // generisk sortering
        Arrays.sort(p);
        System.out.println(Arrays.toString(p));       // skriver ut sortert

        // Utskrift:

        // Boris Zukanovic er størst
        // [Ali Kahn, Kari Pettersen, Kari Svendsen, Azra Zukanovic, Boris Zukanovic]
    }
}
