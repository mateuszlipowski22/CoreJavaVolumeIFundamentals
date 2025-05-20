package section_4.e4_3;
public class StaticTest {
    public static void main(String[] args) {

        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Rober Siwek", 75000);
        staff[1] = new Employee("Jacek Cydejko", 50000);
        staff[2] = new Employee("Mariusz Romańczuk", 40000);


        for(Employee e : staff){
            e.setId();
            System.out.println("name="+e.getName()+", id="+e.getId()+", salary="+e.getSalary());
        }

        int n = Employee.getNextId();
        System.out.println("Następny dostępny identyfikator=" +n);
    }
}

class Employee{
    private static int nextId=1;
    private String name;
    private double salary;
    private int id;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public static int getNextId() {
        return nextId;
    }

    public int getId() {
        return id;
    }


    public void setId() {
        id=nextId;
        nextId++;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Grzegorz", 50000);
        System.out.println(e.getName()+" "+e.getSalary());
    }
}
