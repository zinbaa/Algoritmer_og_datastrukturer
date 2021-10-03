package ukeoppgaver.uke37.seksjon145;

import eksempelklasser.Måned;

public class oppgave3 {
    public static void main(String[] args) {
        for (Måned m : Måned.høst()){
            System.out.println(m.toString() + " (" + m.name() + ")" + m.mndnr());
        }
    }
}
