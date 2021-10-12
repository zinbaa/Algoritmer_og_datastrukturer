package ukeoppgaver.uke38.seksjon151;

public class oppgave3 {
    public static void main(String[] args) {
        System.out.println(tverrsum(72416));
        System.out.println(tverrsum2(72416));
    }
    public static int tverrsum(int n)              // n må være >= 0
    {
        if (n < 10) return n;                        // kun ett siffer
        else return tverrsum(n / 10) + (n % 10);     // metoden kalles
    }


    public static int tverrsum2(int n)              // n må være >= 0
    {
        if (n < 10) return n;                        // kun ett siffer
        int sum = 0;
        while (n > 0) {
            sum+= (n%10);
            n = (n/10);
        }
        return sum;
    }
}