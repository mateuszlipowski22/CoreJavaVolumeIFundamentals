package section_5.e5_1_2_3;

import java.time.LocalDate;

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
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
    public String toString() {
        return "name="+this.getName()+", salary="+this.getSalary()+", hireDay="+this.getHireDay();
    }
}
