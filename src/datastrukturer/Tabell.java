package datastrukturer;

import java.util.Random;

public class Tabell {

    private Tabell() {}

    public static void skriv(int[] a, int fra, int til){

        fratilKontroll(a.length, fra, til);
        if(til - fra > 0) System.out.print(a[fra]);
        for (int i = fra +1; i < til; i++){
            System.out.print(" " + a[i]);
        }
    }

    public static void skriv(int[] a){
        skriv(a,0,a.length);
    }

            public static void bytt(int[] a, int i, int j)
            {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }

            public static void bytt(char[] a, int i, int j)
            {
                char temp = a[i]; a[i] = a[j]; a[j] = temp;
            }

            public static int[] randPerm(int n)
            {
                int[] a = new int[n]; // fyller tabellen med 1, 2, . . , n
                for (int i = 0; i < n; i++) a[i] = i+1;

                Random r = new Random();  // hentes fra java.util

                for (int k = n-1; k > 0; k--)
                {
                    int i = r.nextInt(k+1);  // tilfeldig tall fra [0,k]
                    bytt(a,k,i);
                }

                return a; // tabellen med permutasjonen returneres

            } // randPerm



            public static void randPerm(int[] a) // stokker om a
            {
                Random r = new Random();  // hentes fra java.util

                for (int k = a.length-1; k > 0; k--)
                {
                    int i = r.nextInt(k+1);  // tilfeldig tall fra [0,k]
                    bytt(a,k,i);
                }
            }

            public static int maks(int[] a, int fra, int til)
            {
                if (fra < 0 || til > a.length || fra >= til)
                {
                    throw new IllegalArgumentException("Illegalt intervall!");
                }

                int m = fra;              // indeks til største verdi i a[fra:til>
                int maksverdi = a[fra];   // største verdi i a[fra:til>

                for (int i = fra + 1; i < til; i++)
                {
                    if (a[i] > maksverdi)
                    {
                        m = i;                // indeks til største verdi oppdateres
                        maksverdi = a[m];     // største verdi oppdateres
                    }
                }

                return m;  // posisjonen til største verdi i a[fra:til>
            }

    public static int maks(int[] a)  // bruker hele tabellen
    {
        return maks(a,0,a.length);     // kaller metoden over
    }


    public static int min(int[] a, int fra, int til)
    {
        if (fra < 0 || til < a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;              // indeks til minste verdi i a[fra:til>
        int minverdi = a[fra];   // minste verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] < minverdi)
            {
                m = i;                // indeks til minste verdi oppdateres
                minverdi = a[m];     // minste verdi oppdateres
            }
        }

        return m;  // posisjonen til minste verdi i a[fra:til>
    }

    public static int min(int[] a)  // bruker hele tabellen
    {
        return min(a,0,a.length);     // kaller metoden over
    }


    public static void fratilKontroll(int tablengde, int fra, int til)
    {
        if (fra < 0)                                  // fra er negativ
            throw new ArrayIndexOutOfBoundsException
                    ("fra(" + fra + ") er negativ!");

        if (til > tablengde)                          // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException
                    ("til(" + til + ") > tablengde(" + tablengde + ")");

        if (fra > til)                                // fra er større enn til
            throw new IllegalArgumentException
                    ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");
    }

    public static void vhKontroll(int tablengde, int v, int h) {
        if (v < 0)
            throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");

        if (h >= tablengde)
            throw new ArrayIndexOutOfBoundsException
                    ("h(" + h + ") >= tablengde(" + tablengde + ")");

        if (v > h + 1)
            throw new IllegalArgumentException
                    ("v = " + v + ", h = " + h);
    }

    public static int[] nestMaks(int[] a)  // legges i class Tabell
    {
        int n = a.length;   // tabellens lengde

        if (n < 2) throw   // må ha minst to verdier!
                new java.util.NoSuchElementException("a.length(" + n + ") < 2!");

        int m = maks(a);  // m er posisjonen til tabellens største verdi

        int nm;           // nm skal inneholde posisjonen til nest største verdi

        if (m == 0)                            // den største ligger først
        {
            nm = maks(a, 1, n);                  // leter i a[1:n>
        }
        else if (m == n - 1)                   // den største ligger bakerst
        {
            nm = maks(a, 0, n - 1);              // leter i a[0:n-1>
        }
        else
        {
            int mv = maks(a, 0, m);              // leter i a[0:m>
            int mh = maks(a, m + 1, n);          // leter i a[m+1:n>
            nm = a[mh] > a[mv] ? mh : mv;        // hvem er størst?
        }

        return new int[] {m,nm};      // m i posisjon 0 , nm i posisjon 1

    } // nestMaks

    public static void snu(int[] a, int v, int h)  // snur intervallet a[v:h]
    {
        while (v < h) bytt(a, v++, h--);
    }

    public static void snu(int[] a, int v)  // snur fra og med v og ut tabellen
    {
        snu(a, v, a.length - 1);
    }

    public static void snu(int[] a)  // snur hele tabellen
    {
        snu(a, 0, a.length - 1);
    }

    public static boolean nestePermutasjon(int[] a)
    {
        int i = a.length - 2;                    // i starter nest bakerst
        while (i >= 0 && a[i] > a[i + 1]) i--;   // går mot venstre
        if (i < 0) return false;                 // a = {n, n-1, . . . , 2, 1}

        int j = a.length - 1;                    // j starter bakerst
        while (a[j] < a[i]) j--;                 // stopper når a[j] > a[i]
        bytt(a,i,j); snu(a,i + 1);               // bytter og snur

        return true;                             // en ny permutasjon
    }

    public static int inversjoner(int[] a)
    {
        int antall = 0;  // antall inversjoner
        for (int i = 0; i < a.length - 1; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] > a[j]) antall++;  // en inversjon siden i < j
            }
        }
        return antall;
    }


    public static void utvalgssortering(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
            bytt(a, i, min(a, i, a.length));  // to hjelpemetoder
    }

    public static int lineærsøk(int[] a, int verdi) // legges i class Tabell
    {
        if (a.length == 0 || verdi > a[a.length-1])
            return -(a.length + 1);  // verdi er større enn den største

        int i = 0; for( ; a[i] < verdi; i++);  // siste verdi er vaktpost

        return verdi == a[i] ? i : -(i + 1);   // sjekker innholdet i a[i]
    }









}
