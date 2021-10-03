package ukeoppgaver.uke36.seksjon135;

public class oppgave3 {

    public static int linarsok(int[] a, int verdi){

        if (a.length == 0 || verdi < a[0]) {
            return -1;
        }
            int i = a.length-1; for ( ; a[i] > verdi; i--);

                    return verdi == a[i] ? i : -(i+2);


    }
}
