package section_5.e5_4_5_6_7;
import java.time.LocalDate;

class Employee extends Person {
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }


    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent){

        double raise = salary*byPercent/100;
        salary+=raise;

    }

    @Override
    public String getDescription() {
        return String.format("pracownik zarabiający %.2f zł", salary);
    }

    @Override
    public String toString() {
        return "name="+this.getName()+", salary="+this.getSalary()+", hireDay="+this.getHireDay();
    }


}
