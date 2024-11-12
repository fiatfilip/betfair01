package ro.siit.patterns.creational;

public class SigletonPrivateConstructor {
    private static SigletonPrivateConstructor instance;
    private SigletonPrivateConstructor() {}
    public static SigletonPrivateConstructor getInstance(){
        if(instance == null){
            instance = new SigletonPrivateConstructor();
        }
        return instance;
    }
}
