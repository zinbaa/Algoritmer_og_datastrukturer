package ukeoppgaver.uke36.seksjon134;

import datastrukturer.Tabell;

public class oppgave3 {

    // 1) ii) 3 4 5 16 21 19 7 23 10 14 15 11 6 17 8
    // 1. 3 4 5 6 21 19 7 23 10 14 15 11 16 17 8
    // 2. 3 4 5 6 7 19 21 23 10 14 15 11 16 17 8
    // 3. 3 4 5 6 7 8 21 23 10 14 15 11 16 17 19
    // 4. 3 4 5 6 7 8 10 23 21 14 15 11 16 17 19
    // 5. 3 4 5 6 7 8 10 11 21 14 15 23 16 17 19

    // ii) 6. 3 4 5 6 7 8 10 11 14 21 15 23 16 17 19
    // 7. 3 4 5 6 7 8 10 11 14 15 21 23 16 17 19

    public static void main(String[] args) {
        int[] a = {7,5,9,2,10,4,2,8,6,3};     // en usortert heltallstabell
        Tabell.utvalgssortering(a);           // stigende sortering
        Tabell.snu(a);                        // tabellen snus
        Tabell.skriv(a);                        // 10 9 8 7 6 5 4 3 2 1
    }

}
