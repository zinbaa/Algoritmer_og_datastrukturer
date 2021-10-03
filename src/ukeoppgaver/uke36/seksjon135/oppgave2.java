package ukeoppgaver.uke36.seksjon135;

import datastrukturer.Tabell;

public class oppgave2 {
    public static void main(String[] args) {
        int[] a = {3,8,10,12,14,16,21,24,27,30,32,33,34,37,40};// Figur 1.3.5 a)
        int[] b = {1};
        System.out.println(Tabell.lineærsøk(a,40));              // utskrift: 10
        System.out.println(Tabell.lineærsøk(a,41));              // utskrift: -11
    }
}
