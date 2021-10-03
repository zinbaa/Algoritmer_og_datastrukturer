package ukeoppgaver.uke36.seksjon138;

import datastrukturer.Tabell;

import java.util.Arrays;

public class oppgave6 {
    public static void main(String[] args) {
        int[] a = Tabell.randPerm(1000);
        int[] b = a.clone();
        long tid1 = System.currentTimeMillis();
        Tabell.utvalgssortering(a);
        tid1 = System.currentTimeMillis()-tid1;


        long tid2 = System.currentTimeMillis();
        Tabell.innsettingssortering(b);
        tid2 = System.currentTimeMillis()-tid2;

        System.out.println("Utvalgssortering bruker: " + tid1);
        System.out.println("Innsettingssortering bruker: " + tid2);

    }
}
