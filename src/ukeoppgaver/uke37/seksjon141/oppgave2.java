package ukeoppgaver.uke37.seksjon141;

public class oppgave2 {
    public static void main(String[] args) {
        char[] c = "JASMIN".toCharArray();
        int utskrift = maks(c);
        System.out.println(c[utskrift]);

    }
    public static int maks(char[] c)     // legges i class Tabell
    {
        int m = 0;                           // indeks til største verdi
        double maksverdi = c[0];             // største verdi

        for (int i = 1; i < c.length; i++) if (c[i] > maksverdi)
        {
            maksverdi = c[i];     // største verdi oppdateres
            m = i;                // indeks til største verdi oppdaters
        }
        return m;     // returnerer posisjonen til største verdi
    }
}
