package ukeoppgaver.uke36.seksjon134;

import datastrukturer.Tabell;

public class oppgave9 {

    public static void utvalgssortering(int[] a, int fra, int til)
    {
        Tabell.fratilKontroll(a.length, fra, til);

        for (int i = fra; i < til - 1; i++)
        {
            Tabell.bytt(a, i, Tabell.min(a, i, til));  // to hjelpemetoder
        }
    }
}
