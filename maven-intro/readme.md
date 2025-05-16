SNAPSHOT
- Versione del pacchetto ancora in lavorazione (non definitiva)

SCOPE
- provided -> vuol dire che la libreria non dovrà fare parte del pacchetto finale
- runtime -> vuol dire che la libreria dovrà essere sempre utilizzata in fase di esecuzione del programma
- compile -> vuol dire che la libreria deve essere inserita nel pacchetto finale
- test -> vuol dire che la libreria deve essere utilizzata e compresa solo in fase di test
- system e import -> non le utilizzeremo

Gli scope aiutano ad evitare lo spreco di memoria e il caricamento eccessivo di dati

Nei lifecycle, nella dashboard di maven troverete quelli che vengono chiamati GOAL DI MAVEN

Dipendenze transitive
- Sono le librerie da cui dipende una nostra libreria

MVN REPOSITORY
- contiene la descrizione di tutte le librerie maven

Nomenclatura configurazioni
- Quando una configurazione fa riferimento ad una classe specifica si usa <nome della classe>Config
- Invece quando una classe è di configurazione generale si chiamerà Configuration

ANNOTATION
- Non sono comandi
- Sono direttive per il compilatore - si scrivon con la @ iniziale

Pattern Singleton e Pattern Prototype
- Singleton -> Esiste una sola classe nel contesto

model -> controller -> service -> repository

Questo schema è seguito per una regola fondamentale la Separtion Of Concerned , ma anche la Single Responsability

model -> Servono a dar forma concreta (oggetti) ai record di una tabella
controller -> Servono ad intercettare le richieste http e a dare delle risposte (Anche gestiscono le viste)
service -> Contengono la logica di business
repository -> Sono gli unici delegati alla comunicazione con il DB

Best practice da oggi sarà SEMPRE creare prima le interfacce di determinate funzioni

Firme dei metodi
- Descrivono solo il metodo per quello che fa non hanno un corpo

Quando esiste una unica implementazione di una interfaccia si sege questa nomenclatura <nome della classe>Impl

@Component
@Autowired
@Repository