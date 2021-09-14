package ukeoppgaver.uke35.seksjon124;

import datastrukturer.Tabell;

public class oppgave4 {

    public static void sortering(int[] a){

        for (int i = a.length-1; i < 1; i--){

            int m = Tabell.maks(a);
            Tabell.bytt(a, i-1,m);
        }


    }
}
