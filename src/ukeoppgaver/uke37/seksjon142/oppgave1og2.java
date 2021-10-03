package ukeoppgaver.uke37.seksjon142;

import datastrukturer.Tabell;

import java.util.Arrays;

public class oppgave1og2 {
    public static void main(String[] args) {
        String[] s = {"Sohil","Per","Thanh","Fatima","Kari","Jasmin"};
        int k = Tabell.maks(s);        // hvilken maks-metode?
        System.out.println(s[k]);      // Utskrift:  Thanh

        String[] navn = {"Per","Kari","Ole","Anne","Ali","Eva"};
        Tabell.innsettingssortering(navn);
        System.out.println(Arrays.toString(navn));  // [Ali, Anne, Eva, Kari, Ole, Per]
    }
}
