package ro.siit.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Clerk {
    public String whatsYourName(Identifiable person){
        return person.identify();
    };

    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        List<Identifiable> personsInLine = new ArrayList<>();
        personsInLine.add(new GermanPerson("Hans"));
        personsInLine.add(new RomanianPerson("Ion"));
        personsInLine.add(new RomanianPerson("Martin"));

        for (Identifiable person : personsInLine){
            System.out.println(clerk.whatsYourName(person));
        }
    }
}
