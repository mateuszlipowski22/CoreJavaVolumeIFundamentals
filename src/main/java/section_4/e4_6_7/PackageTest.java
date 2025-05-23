package section_4.e4_6_7;
import section_4.e4_6_7.corejava.Employee;
import static java.lang.System.*;

public class PackageTest {
    public static void main(String[] args) {
        Employee harry = new Employee("Harry", 5000, 1990,1,1);
        harry.raiseSalary(5);

        out.println("name = "+harry.getName()+", salary="+harry.getSalary());
    }
}
