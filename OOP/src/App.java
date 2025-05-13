public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        //p = è una variabile di tipo Person
        //new è una keyword richama un costruttore
        //se nella classe non vediamo alcun costruttore ESPLICITO vuol dire che verrà ultimato dal costruttore di default
        //Tutta l'operazione che segue viene definita istanziazione di un oggetto
        Person p1 = new Person("Andrea","Palladino",25);

        // p1.introduceYourself();
        //Person p2 = new Person("Russo");
        // Person p2 = new Person("Andrea","Palladino",25);

        // Person p2 = p1;

        // p2.name = "Antonio";

        // p1.introduceYourself();

        // Student s = new Student("Gicomo","Bruzzone",0,9);

        // s.introduceYourself();

        Person p2 = new Person("Andrea","Palladino",25);

        //p2.name = "Antonio";

        //p2.setName("Antonio");

        //"." si chiama dot notation ci consetne di entrare all'interno di un oggetto
        // p.name = "Andrea";
        // p.surname = "Palladino";
        // p.age = 25;

        // infos(p);

        // p.introduceYourself();

        // over("Andrea");
        // over("Andrea", 27);
        // over(2,3);

        //System.out.println(p1);
        //System.out.println(p2);

        // System.out.println(p1 == p2);

        //equals è un metodo di object che ereditano tutti gli oggetti
        System.out.println(p1.equals(p2));
    }

    // public static void infos(Person p){
    //     System.out.println(p.name + " " + p.surname + " " + p.age);
    // }

    // public static void over(String name){
    //     System.out.println(name);
    // }

    // public static void over(String name, int age){
    //     System.out.println(name + " " + age);
    // }

    // public static void over(int num1, int num2){
    //     System.out.println(num1 + " " + num2);
    // }

    //Funzione purissima
    public static int over(int num1, int num2){
        return num1 + num2;
    }
}
