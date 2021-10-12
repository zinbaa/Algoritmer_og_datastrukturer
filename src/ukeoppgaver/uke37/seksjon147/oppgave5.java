package ukeoppgaver.uke37.seksjon147;

import datastrukturer.Tabell;
import eksempelklasser.Komporator;

import java.util.Arrays;

public class oppgave5 {
    public static void main(String[] args) {
        String[] s = {"Lars","Anders","Bodil","Kari","Per","Berit"};
        Tabell.innsettingssortering(s, Komporator.Komparator.orden(x -> -x.length()));

        System.out.println(Arrays.toString(s));
        // Utskrift: [Per, Kari, Lars, Berit, Bodil, Anders]
    }
}
