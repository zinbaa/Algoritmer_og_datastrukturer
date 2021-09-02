package ukeoppgaver.uke34.seksjon113;

public class Oppgave5 {

    public static void main(String[] args) {
        int[] liste = {5, 3, 7, 9, 10, 11};
        int[] nyliste = minmaks(liste);

        for (int i = 0; i< nyliste.length; i++){
            System.out.println("Posisjon: " + nyliste[i] + " ");
        }
    }

    public static int[] minmaks(int[] a) {
       int min = 0, minverdi = a[0];
       int maks = 0, maksverdi = a[0];

       int verdi = 0;

       for (int i=1; i<a.length; i++){
           verdi = a[i];

           if (verdi > maksverdi){
               maksverdi = verdi;
               maks = i;
           }
           else if (verdi < minverdi){
               minverdi = verdi;
               min = i;
           }

       }
        return new int[]{min, maks};
    }
}
