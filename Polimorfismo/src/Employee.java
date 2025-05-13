public class Employee extends Person{

    public String role;

    public Employee(String name, String surname, int age, String role) {
        super(name, surname, age);
        this.role = role;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ciao sono " + name + " " + surname + " e ho " + age + " anni e sono un " + role + "! \n");
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
