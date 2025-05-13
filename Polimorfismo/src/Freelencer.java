public class Freelencer extends Employee{

    public String project;
    public int comminsins;
    
    public Freelencer(String name, String surname, int age, String role, String project, int comminsins) {
        super(name, surname, age, role);
        this.project = project;
        this.comminsins = comminsins;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ciao sono " + name + " " + surname + " e ho " + age + " anni e sono un " + role +  " e mi occupo di " + project +  " con un salario di " + comminsins + "! \n");
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getComminsins() {
        return comminsins;
    }

    public void setComminsins(int comminsins) {
        this.comminsins = comminsins;
    }
    
}
