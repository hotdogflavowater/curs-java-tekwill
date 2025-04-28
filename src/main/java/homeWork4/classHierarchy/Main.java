package homeWork4.classHierarchy;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alex", "Moscow");
        Student student = new Student("Anna", "St. Petersburg", "Computer Science", 2, 5000);
        Staff staff = new Staff("Ivan", "Kazan", 70000,"KFU" );

        System.out.println(person);
        System.out.println(student);
        System.out.println(staff);
    }
}
