package ukeoppgaver.uke36.seksjon134;

public class oppgave5 {

    public static void utvalgssortering(int[] a){

        for (int i = 0; i < a.length-1; i++){

            int min = i;        // indeks til minste foreløpige verdi
            int minverdi = a[i]; // foreløpig minste verdi

            for (int j = i+1; j < a.length; j++){
                if (a[j] < minverdi){
                    min = j;
                    minverdi = a[j];

                   // bytter den nye minste verdien med første verdi i arrayet
                 int temp = a[i];
                 a[i] = a[min];
                 a[min] = temp;

                }
            }
        }
    }




}
