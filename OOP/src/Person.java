//Descrizione
public class Person {
    //Proprietà (Attributi [Fields])
    private String name;
    private String surname;
    private int age;

    //Costruttore
    //Il costruttore possiede lo stesso nome della classe, scritto nello stesso ed identico modo
    public Person() {
    }

    public Person(String surname){
        this.surname = surname;
    }
    
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    
    //Metodi
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname, int pin) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //Metodo di classe non statico
    //This -> Dell'oggetto che ho creato
    //In java il this NON E' OBBLIGATORIO
    public void introduceYourself(){
        // System.out.println(this.name + " " + this.surname + " " + this.age);
        System.out.println("Ciao sono " + name + " " + surname + " " + age + "\n");

    }

    @Override
    public boolean equals(Object obj) {
        /*
         * Se gli attributi dell'oggetto in cui sono dichirato 
         * sono uguali agli attributi dell'oggetto che sta arrivando come parametro
         * allora ritorna true
         */
        if (obj instanceof Person) {
            Person p2 = (Person) obj;
            return this.name == p2.name && this.surname == p2.surname && this.age == p2.age;
        }

        return false;
        
    }
}