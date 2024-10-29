package ro.siit.collections;

import java.util.ArrayList;
import java.util.List;

public class Cursant implements Comparable<Cursant> {
    private int varsta;
    private List<Curs> cursuri = new ArrayList<>();
    private String nume;

    public Cursant(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public int getVarsta() {
        return varsta;
    }

    public String getNume() {
        return nume;
    }

//    public List<Curs> getCursuri() {
//        return this.cursuri;
//    }

    public List<Curs> getCursuri() {
        List<Curs> cursuri = new ArrayList<>();
        cursuri.addAll(this.cursuri);
        return cursuri;
    }

    public void addCurs(Curs curs){
        cursuri.add(curs);
    }

    @Override
    public int compareTo(Cursant o) {
        return this.nume.compareTo(o.getNume());
        // return o.getNume().compareTo(this.nume);
    }

    @Override
    public String toString() {
        return "Cursant{" +
                "varsta=" + varsta +
                ", cursuri=" + cursuri +
                ", nume='" + nume + '\'' +
                '}';
    }
}
