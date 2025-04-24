package section_2.e2_1;

public class Weclome {
    public static void main(String[] args) {
        String greeting = "Witaj. Czytelniku!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
