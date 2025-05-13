public class Teacher extends Employee {
    
    private String subject;
    private int salary;

    public Teacher(String name, String surname, int age, String role, String subject, int salary) {
        super(name, surname, age, role);
        this.subject = subject;
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ciao sono " + name + " " + surname + " e ho " + age + " anni e sono un " + role +  " e mi occupo di " + subject +  " con un salario di " + salary + "! \n");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}
