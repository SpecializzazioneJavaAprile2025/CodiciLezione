public class Teacher extends Person {
    public String subject;

    public Teacher(String name, String surname, int age, String subject) {
        //super chiama il costruttore del padre
        super(name, surname, age);
        this.subject = subject;
    }

    public void speak(){
        System.out.println("Ciao sono il docente: " + this.name + " " + this.surname + " , ho " + this.age + " anni ed insegno " + this.subject + "!");
    }
}
