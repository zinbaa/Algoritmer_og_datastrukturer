package ukeoppgaver.uke36;

import datastrukturer.Tabell;

public class oppgave2 {

    public static void main(String[] args) {
        int[] a = {2,6,5,4,3,1};
        Tabell.nestePermutasjon(a);
        Tabell.skriv(a);
    }
    // a) 2 3 6 1 4 5 = 2 3 6 1 5 4
    // b) 2 3 6 1 5 4 = 2 3 6 4 1 5
    // c) 2 3 1 6 5 4 = 2 3 4 1 5 6
    // d) 2 3 6 5 4 1 = 2 4 1 3 5 6
    // e) 2 6 5 4 3 1 = 3 1 2 4 5 6


}
