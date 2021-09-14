package ukeoppgaver.uke35.seksjon123;

import datastrukturer.Tabell;

import java.io.IOException;
import java.util.NoSuchElementException;

import static datastrukturer.Tabell.fratilKontroll;

public class oppgave3 {

    public static void main(String[] args) throws IOException {

        int[] a = Tabell.randPerm(10);
        int[] c = null;

        maks(a,-1,10);

    }

    public static int maks(int[] a, int fra, int til)
    {

        if (a == null) throw new NullPointerException
                ("parametertabellen a er null!");

        fratilKontroll(a.length,fra,til);

        if (fra == til)
            throw new NoSuchElementException
                    ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");

        int m = fra;            // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] > maksverdi)
            {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }

        return m;  // posisjonen til største verdi i a[fra:til>
    }
}

