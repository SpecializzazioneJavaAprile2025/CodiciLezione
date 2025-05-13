import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        // String[] args2 = new String[] { "a", "b", "c", "d", "e" };

        // System.out.println(args2[3]);

        List<Person> people = new ArrayList<Person>();

        // List<Person> people = new ArrayList<>();

        // people.add(new Person("Federica","Mudu",21));
        // people.add(new Person("Alessandro","Russo", 27));
        // people.add(new Person("Gianmarco","Nacci", 17));
        // people.add(new Person("Francesca","Coduti", 23));

        // for (Person p : people) {
        //     System.out.println(p.getNome() + " " + p.getCognome() + " " + p.getEta());
        // }

        // for (int i = 0; i < people.size(); i++) {
        //     System.out.println(people.get(i).getNome() + " " + people.get(i).getCognome() + " " + people.get(i).getEta());
        // }

        //System.out.println(people.get(2).getNome());

        // Iterator<Person> iterator = people.iterator();
        // while (iterator.hasNext()) {
        //     Person p = iterator.next();
        //     System.out.println(p.getNome() + " " + p.getCognome() + " " + p.getEta());
        // }

        // List<Person> people2 = new LinkedList<>();

        // people2.addAll(
        //     List.of(
        //         new Person("Federica","Mudu",21),
        //         new Person("Alessandro","Russo", 27),
        //         new Person("Gianmarco","Nacci", 17),
        //         new Person("Francesca","Coduti", 23)
        //     )
        // );

        // for (Person p : people2) {
        //     System.out.println(p.getNome() + " " + p.getCognome() + " " + p.getEta());
        // }

        // System.out.println(people2.get(2).getNome());

        // Set<Person> people3 = new HashSet<>(
        //     Set.of(
        //         new Person("Federica","Mudu",21),
        //         new Person("Federica","Mudu",21),
        //         new Person("Alessandro","Russo", 27),
        //         new Person("Gianmarco","Nacci", 17),
        //         new Person("Francesca","Coduti", 23)    
        //     )
        // );

        // for (Person p : people3) {
        //     System.out.println(p.getNome() + " " + p.getCognome() + " " + p.getEta());
        // } 
        
        // Set<Person> people3 = new TreeSet<>(
        //     Set.of(
        //         new Person("Federica","Mudu",21),
        //         new Person("Federica","Mudu",21),
        //         new Person("Alessandro","Russo", 27),
        //         new Person("Gianmarco","Nacci", 17),
        //         new Person("Francesca","Coduti", 23)    
        //     )
        // );


        // for (Person p : people3) {
        //     System.out.println(p.getNome() + " " + p.getCognome() + " " + p.getEta());
        // }   


        Map<String, Person> personMap = new HashMap<>();

        // Aggiunta di persone alla Map
        personMap.put("RSSMND90T21A793H", new Person("Mario", "Rossi", 21 ));
        personMap.put("VRNVCT78H56Z123Q", new Person("Maria", "Verdi", 34));
        personMap.put("BNCLMP92P12Q345T", new Person("Luca", "Bianchi", 36 ));
        
        // Accesso ai dati di una persona tramite codice fiscale
        Person marioRossi = personMap.get("RSSMND90T21A793H");
        System.out.println("Mario Rossi: " + marioRossi); // Output: Mario Rossi: Person{name='Mario', surname='Rossi', cf='RSSMND90T21A793H'}
        
        // Controllo se una persona è presente nella Map
        boolean hasLucaBianchi = personMap.containsKey("BNCLMP92P12Q345T");
        System.out.println("Contiene Luca Bianchi? " + hasLucaBianchi); // Output: Contiene Luca Bianchi? true
        
        // Rimozione di una persona dalla Map
        personMap.remove("VRNVCT78H56Z123Q");
        
        // Stampa di tutte le persone nella Map
        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
