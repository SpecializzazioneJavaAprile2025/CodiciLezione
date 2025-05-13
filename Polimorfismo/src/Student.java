public class Student extends Person {

    public String average;

    public Student(String name, String surname, int age, String average) {
        super(name, surname, age);
        this.average = average;
    }

    @Override
    public void displayInfo() {
        System.out.println("Ciao sono " + name + " " + surname + " e ho " + age + " anni e ho un media di " + average + "! \n");
    }

    public String getAverage() {
        return average;
    }

    public void setAverage(String average) {
        this.average = average;
    }

}
