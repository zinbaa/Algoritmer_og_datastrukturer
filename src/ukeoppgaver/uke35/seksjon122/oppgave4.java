package ukeoppgaver.uke35.seksjon122;

import datastrukturer.Tabell;

public class oppgave4 {

    public static void skriv(int[] a, int fra, int til){

        Tabell.fratilKontroll(a.length, fra, til);
        if(til - fra > 0) System.out.print(a[fra]);
        for (int i = fra +1; i < til; i++){
            System.out.print(" " + a[i]);
        }
    }

    public static void skriv(int[] a){
        skriv(a,0,a.length);
    }
}
