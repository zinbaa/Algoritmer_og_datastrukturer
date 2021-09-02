package ukeoppgaver.uke34.seksjon113;

public class Oppgave6 {

    public static void main(String[] args) {

        System.out.println(fak(0));
    }

    public static long fak(int n){

        if (n < 0 ) { //vi tar ikke inn negative tall
            throw new IllegalArgumentException("n < 0, ikke gyldig.");
        }
            long fak = 1; //hvis n = 0 eller n = 1 utfores ingen multiplikasjoner

            for (int i=2; i<=n; i++){ //hvis n > 1 utføres det n-1 multiplikasjoner
                fak*=i; // fak = fak * i;
            }
        return fak;
    }
}
