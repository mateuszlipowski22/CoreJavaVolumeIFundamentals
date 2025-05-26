package section_5.e5_1_2_3;

import java.util.Arrays;
import java.util.stream.StreamSupport;

public class ManagerTest {
    public static void main(String[] args) {
        Manager boss = new Manager("Karol Parol", 80000, 1987,12,15);

        boss.setBonus(5000);

        Employee[] staff = new Employee[3];

        staff[0] = boss;
        staff[1] = new Employee("Henryk Kwiatek",50000,1989,10,1);
        staff[2] = new Employee("Artur Kwiatkowski",40000,1990,3,15);

        Arrays.stream(staff).forEach(System.out::println);

//        for(Employee e : staff){
//            System.out.println("name="+e.getName()+", salary="+e.getSalary()+", hireDay="+e.getHireDay());
//        }
    }
}
