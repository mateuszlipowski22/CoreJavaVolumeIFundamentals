package section_4.e4_5;

import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Rober", 75000);
        staff[1] = new Employee(50000);
        staff[2] = new Employee();

        for(Employee e : staff){
            System.out.println("name="+e.getName()+", id="+e.getId()+", salary="+e.getSalary());

        }
    }
}

class Employee{
    private static int nextId=1;
    private String name = "";
    private double salary;
    private int id;

    static {
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    {
        id = nextId;
        nextId++;
    }



    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        this("Empolyee #", salary);
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    public int getId() {
        return id;
    }
}