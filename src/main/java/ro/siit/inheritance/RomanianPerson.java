package ro.siit.inheritance;

public class RomanianPerson implements Identifiable{
    private String name;

    public RomanianPerson(String name) {
        this.name = name;
    }

    @Override
    public String identify() {
        return this.name;
    }

    public void cantLaFluier(){
        System.out.println("La fluier est la romanian person");
    }
}
