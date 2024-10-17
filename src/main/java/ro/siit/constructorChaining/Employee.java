package ro.siit.constructorChaining;

public class Employee extends Person{
    private double salary;
    public Employee(String name, double salary) {
        super(name);
        System.out.println("Employee constructor with params");
        this.salary = salary;
    }

//    public Employee(){
//        super("Unemployed Jane");
//        this.salary = 0.0;
//    }

    public Employee(){
        this("Unemployed Jane", 0.0);
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String getName() {
        System.out.println(super.getName());
        return "Employee " + super.getName();
    }

    public String getName(String prefix){
        return prefix + super.getName();
    }

//    public String getName(String otherPrefix){
//        return otherPrefix + super.getName();
//    }
}
