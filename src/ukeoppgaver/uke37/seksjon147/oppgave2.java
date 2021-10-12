package ukeoppgaver.uke37.seksjon147;

import datastrukturer.Tabell;
import eksempelklasser.Komporator;

import java.util.Arrays;

public class oppgave2 {
    public static void main(String[] args) {
        Double[] d = {5.7,3.14,7.12,3.9,6.5,7.1,7.11};
        Boolean[] b = {false, true, true, false, false, true, false, true};
        Tabell.innsettingssortering(b, Komporator.Komparator.naturligOrden());

        System.out.println(Arrays.toString(b));
    }
}
