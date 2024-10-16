package ro.siit.inheritance;

public class GermanPerson implements Identifiable{
    private Pass pass;

    public GermanPerson(String name) {
        this.pass = new Pass(name);
    }

    @Override
    public String identify() {
        return this.pass.getNameOnPass();
    }

    public void bierTrinken(){
        System.out.println("Ich trinke gern Bier");
    }
}
