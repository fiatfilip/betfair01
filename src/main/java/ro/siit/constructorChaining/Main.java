package ro.siit.constructorChaining;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        System.out.println(person.getName());
//
//        Person person2 = new Person();
//        System.out.println(person2.getName());
//        person2.setName("Ionel");
//        System.out.println(person2.getName());

        Employee employee = new Employee();
        System.out.println(employee.getName());
        System.out.println(employee.getName("Mrs. "));
    }
}
