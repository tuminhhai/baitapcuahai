package Person;

public class Entry {
    public static void main(String[] args) {
        Student s = new Student("Tuan", 26, "Hai Phong", 9.0);
        s.display();
        System.out.println();
        Teacher t = new Teacher("Thi", 30, "Hai Phong", 2800);
        t.display();
    }
}
