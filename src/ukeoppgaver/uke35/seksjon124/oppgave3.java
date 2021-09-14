package ukeoppgaver.uke35.seksjon124;

import datastrukturer.Tabell;

public class oppgave3 {

    public static int[] nestMaks(int[] a)
    {
        if (a.length < 2) // må ha minst to verdier!
            throw new IllegalArgumentException("a.length(" + a.length + ") < 2!");

        int m = Tabell.maks(a);  // m er posisjonen til tabellens største verdi

        Tabell.bytt(a,a.length-1,m);  // bytter om slik at den største kommer bakerst

        int k = Tabell.maks(a,0,a.length-1);

        if (k == m) k = a.length - 1; // den nest største lå opprinnelig bakerst

        Tabell.bytt(a,a.length-1,m); // bytter tilbake

        return new int[] {m,k};

    } // nestMaks
}
