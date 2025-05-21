package section_4.e4_4;

public class ParamTest {

    public static void main(String[] args) {

        System.out.println("Testowanie triple view");
        double percent = 10;
        System.out.println("Przed: procent="+percent);
        tripleValue(percent);
        System.out.println("Po: procent="+percent);

        System.out.println("\nTestowanie triple salary");
        Employee harry = new Employee("Grzegorz",50000);
        System.out.println("Przed: salary="+harry.getSalary());
        tripleSalary(harry);
        System.out.println("Po: salary="+harry.getSalary());

        System.out.println("\nTestowanie swap");
        Employee a = new Employee("Alicaja",70000);
        Employee b = new Employee("Grzegorz",60000);
        System.out.println("Przed: a="+a.getName());
        System.out.println("Przed: b="+b.getName());
        swap(a,b);
        System.out.println("Po: a="+a.getName());
        System.out.println("Po: b="+b.getName());


    }

    public static void tripleValue(double x){
        x=3*x;
        System.out.println("Koniec metody: x="+x);
    }

    public static void tripleSalary(Employee x){
        x.riseSalary(200);
        System.out.println("Koniec metody: salary="+x.getSalary());
    }

    public static void swap(Employee x, Employee y){
        Employee temp = x;
        x=y;
        y=temp;
        System.out.println("Koniec metody: x="+x.getName());
        System.out.println("Koniec metody: y="+y.getName());
    }
}

class Employee{
    private String name;
    private double salary;
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void riseSalary(int byPercent) {
        double raise = salary*byPercent/100;
        salary += raise;
    }
}
