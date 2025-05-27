package section_5.e5_4_5_6_7;

public abstract class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    public String getName() {
        return name;
    }
}
