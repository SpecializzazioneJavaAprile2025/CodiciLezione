public class Person {
    //Attributi (o proprietà, fields)-> CARATTERISTICHE
    protected String name;
    protected String surname;
    protected int age;

    //Costruttore di default
    public Person() {
    }

    //Costruttore
    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //Metodi (Comportamento)
    public void speak(){
        System.out.println("Ciao sono: " + name + " " + surname + " " + age);
    }

    //Sovrascrivo il commportamento di equals SOLO ED ESCLUSIVAMENTE per la classe person
    @Override
    public boolean equals(Object obj) {
        //System.out.println(pGiuseppe.equals(pLuca));
        //obj.name = "ciccia";
        // return true;
        //Return as soon as possibile
        //Confronto se i riferimenti sono uguali
        if(this == obj) return true;

        //Verifico se il parametro obj è null o le descrizioni dei due parametri sono diverse
        if(obj == null || this.getClass() != obj.getClass()) return false;

        //ho la certezza che obj è un person quindi faccio la trasformazioned a un oggetto generico ad uno specifico (Object -> Person)
        Person p2 = (Person) obj;
        if(this.name == p2.name && this.surname == p2.surname && this.age == p2.age){
            return true;
        }

        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
