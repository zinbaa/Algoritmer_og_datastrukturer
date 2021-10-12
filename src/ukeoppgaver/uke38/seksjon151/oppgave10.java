package ukeoppgaver.uke38.seksjon151;

public class oppgave10 {
    public static void main(String[] args) {
        System.out.println(fakultet(5));
    }
    public static int fakultet(int n){
        if (n==1) return n;
        else {
            return n*fakultet(n-1);

        }
    }
}