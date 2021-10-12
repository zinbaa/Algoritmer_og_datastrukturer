package ukeoppgaver.uke38.seksjon151;

public class oppgave7 {
    public static void main(String[] args) {
        System.out.println(kvadrattall(2));
    }
    public static int kvadrattall(int n){
        if (n == 1) return n;
        else {
            return (kvadrattall(n-1))+n*n;
        }
    }
}
