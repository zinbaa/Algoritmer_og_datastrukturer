package ukeoppgaver.uke36.seksjon136;

import datastrukturer.Tabell;

public class oppgave3og4 {
    public static void main(String[] args) {
        int[] a = {1, 3, 4, 4, 5, 7, 7, 8, 9, 10, 10, 12, 15, 15, 15};
        int verdi = Tabell.binærsøk(a, 15);
        int verdi2 = Tabell.binærsøk3(a, 0, a.length, 15);
        System.out.println(verdi2);
    }
}
