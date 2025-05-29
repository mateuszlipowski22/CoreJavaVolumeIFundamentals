package section_5.e5_4_5_6_7;

public class Student extends Person {
    private String major;
    public Student(String name, String major) {
        super(name);
        this.major = major;
    }

    @Override
    public String getDescription() {
        return "student specjalizacji " + major;
    }
}
