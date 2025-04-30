public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // String name = "Giovanni";
        // String surname = "Verdi";
        // System.out.println("Ciao sono: " + name + " " + surname);

        // String name1 = "Paolo";
        // String surname1 = "Rossi";
        // System.out.println("Ciao sono: " + name1 + " " + surname1);

        // infoPerson("Giovanni", "Verdi");
        // infoPerson("Paolo", "Rossi");
        // infoPerson("Antonella", "Verdi");
        // infoPerson("Luisa", "Rossi");
        // infoPerson("Valeria", "Verdi");
        // infoPerson("Giacomo", "Rossi");
        // infoPerson("Luca", "Verdi");
        // infoPerson("Vincenzo", "Rossi");

        Person pGiuseppe = new Person("Giuseppe","Verdi", 37);

        // pGiuseppe.name = "Giuseppe";
        // pGiuseppe.surname = "Verdi";

        // infoPerson(pGiuseppe);

        // Person pLuca = new Person("Luca","Bianchi", 26);
        Person pLuca = new Person("Giuseppe","Verdi", 37);


        //Person pLuca = pGiuseppe;


        // pLuca.name = "Luca";
        // pLuca.surname = "Bianchi";

        // infoPerson(pLuca);
        // infoPerson("Ciao","Bello");

        // pGiuseppe.speak();
        // pLuca.name = "Andonio";
        // pGiuseppe.speak();

        // System.out.println(pGiuseppe == pLuca);

        System.out.println(pGiuseppe.equals(pLuca));

        // System.out.println(pGiuseppe);
        // System.out.println(pLuca);

        Teacher alek = new Teacher("Alek","Leo",37,"Java");
        alek.speak();
        pGiuseppe.speak();
        // alex.speakTeacher();
    }

    // public static void infoPerson(String name, String surname){
    //     System.out.println("Ciao sono: " + name + " " + surname);
    // }

    // public static void infoPerson(Person person){
    //     System.out.println("Ciao sono: " + person.name + " " + person.surname);
    // }
}
