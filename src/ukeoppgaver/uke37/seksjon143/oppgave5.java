package ukeoppgaver.uke37.seksjon143;

import datastrukturer.Tabell;

public class oppgave5 {
    public static void skriv(Object[] a, int fra, int til){
        Tabell.fratilKontroll(a.length, fra, til);

        for (int i = fra; i < til; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void skriv(Object[] a){
        skriv(a, 0, a.length);
    }

    public static void skrivln(Object[] a, int fra, int til){
        skriv(a, fra, til);
        System.out.println();
    }

    public static void bytt(Object[] a, int i, int j){
        Object temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
