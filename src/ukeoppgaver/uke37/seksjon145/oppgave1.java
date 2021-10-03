package ukeoppgaver.uke37.seksjon145;

import eksempelklasser.Person;
import eksempelklasser.Studium;

public class oppgave1 {
    public static void main(String... args)
    {
        for (Studium s : Studium.values())
        {
            System.out.println(s.toString() + " (" + s.name() + ")");
        }
    /*
    Ingeniørfag - data (Data)
    Informasjonsteknologi (IT)
    Anvendt datateknologi (Anvendt)
    Enkeltemnestudent (Enkeltemne)
    */
    }

}
