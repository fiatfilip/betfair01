package ro.siit.innerAnnonymous;

public class Main {
    public static void main(String[] args) {
        Vehicle.Engine engine = new Vehicle.Engine();
        Vehicle vehicle = new Vehicle();
        vehicle.setEngine(engine);

        Building building =  new Building();
        Building.Apartment apartment = building.new Apartment();
        building.addApartment(apartment);

        MyInterface standardImpl = new MyInterfaceImpl();
        standardImpl.myMethod();

//        MyInterface customImpl = new MyInterface(){
//            @Override
//            public void myMethod() {
//                System.out.println("customImpl.myMethod");
//            }
//        };

        MyInterface customImpl = () -> System.out.println("customImpl.myMethod");

        customImpl.myMethod();
    }
}
