import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        //List.of crea una lista immutabile, cioè non accetta ulteriori elementi
        // List<Person> people = List.of(
        //     new Person("Andrea", Gender.MALE),
        //     new Person("Maria", Gender.FEMALE),
        //     new Person("Paola", Gender.FEMALE),
        //     new Person("Roberto", Gender.MALE),
        //     new Person("Marco", Gender.MALE)
        // );


        //voglio estrarre dalla lista telle le persone che hanno come gender FEMALE
        //- creo una lista vuota
        //- ciclo la lista di persone
        //- per ogni persona controlla l'attributo gender
        //- se questo è uguale a Female pushalo nell'array

        //Se nella new non specifico il tipo di dato stiamo facendo affidamento sulla type inference
        // List<Person> females = new ArrayList<>();
        
        // for (Person person : people) {
        //     if(Gender.FEMALE.equals(person.gender)){
        //         females.add(person);
        //     }
        // }

        // for (Person fPerson : females) {
        //     System.out.println(fPerson.name);
        // }

        //Approccio funzionale
        // List<Person> females = people.stream()
        //                              .filter(person->person.gender.equals(Gender.FEMALE))
        //                              .toList();

        // System.out.println("Lista filtrata \n");
        // for (Person fPerson : females) {
        //     System.out.println(fPerson.name);
        // }

        // System.out.println("Dopo la filter \n");

        // for (Person person : people) {
        //     System.out.println(person.name);
        // }

        // List<Integer> numbers = List.of(
        // 2,5,6,7,8,9,12
        // );


        // Integer sum = numbers.stream()
        //     .filter(number -> number % 2 == 0)
        //     .map(number -> number*number)
        //     .reduce(0, Integer::sum);


        // System.out.println(sum);

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> check = ( Integer num ) -> num % 2 == 0;
        List<Integer> evens = numbers.stream().filter(check).collect(Collectors.toList());
        System.out.println(evens.size());

    }
}
