package ukeoppgaver.uke37.seksjon148;

import datastrukturer.Tabell;
import eksempelklasser.Komporator;

import java.util.Arrays;

public class oppgave4 {
    public static void main(String[] args) {
        String[] s = {"Lars","Anders","Bodil","Kari","Per","Berit"};
        String[] t = {"21","18","8","13","20","6","16","25","3","10"};

        Tabell.innsettingssortering(s, Komporator.Komparator.orden(String::length).deretter(x->x));

        System.out.println(Arrays.toString(s));
        // Utskrift: [Per, Kari, Lars, Berit, Bodil, Anders]
    }
}
