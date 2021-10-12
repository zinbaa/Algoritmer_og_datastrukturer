package ukeoppgaver.uke38.seksjon151;

public class oppgave4 {
    public static void main(String[] args) {
        System.out.println(sifferrot(10));
    }
    public static int sifferrot(int n) {
        while (n >= 10) {
            n = oppgave3.tverrsum2(n);
        }
        return n;
    }
}
