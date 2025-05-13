public class Student extends Person {
    public int vote;

    public Student(String name, String surname, int age, int vote) {
        //Keyword super si passano i parametri al costruttore del padre
        super(name, surname, age);
        this.vote = vote;
    }

    //Override di un metodo
    public void introduceYourself() {
        System.out.println("Ciao sono " + name + " " + surname + " " + age + " e ho " + vote + " voti");   
    }

    // public void presentati(){

    // }

}
