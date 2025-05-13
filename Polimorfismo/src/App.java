public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");

        //Person p = new Person("Giacomo","Bruzzone",12);

        Person e1 = new Employee("Alek", "Leo", 36, "Docente");
        Person s1 = new Student("Francesca", "Coduti", 21, "10");

        Person t1 = new Teacher("Giacomo", "Bruzzone", 36, "Docente", "Matematica", 5000);

        e1.displayInfo();
        s1.displayInfo();
        t1.displayInfo();
    }
}
