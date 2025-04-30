Ctrl + shift + p -> Menu a tendina
Java:Create java project -> selezioniamo questo
No build tools -> unica opzione da cliccare
Una volta cliccato ci aprirà l'explorer del pc per farci selezionare il flder nel quale vogliamo memorizzare il progettino
Una volta scelto verrà fuori uno input dove prima era presente il menu a tendina e ci inserriamo il nome del progettino

FUNZIONI
- Utili per INCAPSULARE della logica e consentirci tramite il nome di RIUTILIZZARLA, permettendoci di rispettare il principio DRY (Don't repeat yourself)

Classificare
- Raggruppare in base a delle caratteristiche comuni

Classi
- Nomi :
    - Prima lettera maiscola
    - In inglese
    - Al singolare
    - E se composte da più parole camel case
in java tutte le classi definiscono un nuovo tipo

OGGETTO
- istanza di una classe
- è il contenitore di dati

COSTRUTTORE
- Modificatore sempre public
- Nome segue stessa dicitura del nome della classe
- Possiede tutti i parametri formali necessari
- Ha il principale compito da dare un valore ai parametri della classe
- this -> Dell'oggetto che ti andrò a creare prendimi l'attribuot X e valorizzalo con il valore Y

OVERLOADING DEL COSTRUTTORE
- Vuol dire che una classe possiede più costruttori

METODO
- Definisce i comportamenti caratteristici della classe
- this -> Dell'oggetto che ho creato chiama quello che ti sto chiedendo
- il this nei meotdi possono essere omesssi

MEORIA JAVA
STACK -> Contiene tutto ciò che NON E' UN OGGETTO del codice
HEAP -> Contiene solo ed esclusivamente gli oggetti


OBJECT REFERENCES
- Ogni variabile di un determinato tipo a cui viene assegnato un oggetto contiene NON L'OGGETTO VERO E PROPRIO MA IL SUO RIFERIMENTO

SIDE EFFECT
- Modifico lo stato di un dato dall'esterno dello socpe in cui è dichiarato

@Override
- Non è un comando
- E' una direttiva per il compilatore, grazie alle annotation il compilatore sa come trattare il codice che segue


FIRMA DEL METODO
- E' il metodo descritto senza il corpo (le parentesi graffe)

OBJECT EQUALITY
- Quando due oggetti sono uguali per attributi
OBJECT IDENTITY
- Quando due oggetti sono uguali in riferimento

Ereditarietà
- Una classe eredita (quindi rende proprie) caratteristiche e funzionalità di una classe padre
- Ereditare vuol dire anche estendere le funzionalità di una classe padre
- Una classe figlia eredita ed estende caratteristiche e funzionalità di una classe padre (derivante)

Modificatori di accesso
- PUBLIC -> Posso accedere in lettura e scrittura da ogni parte del nostro codice
- PRIVATE -> Posso accedere in lettura e scrittura SOLO dalla classe di appartenenza
- PROTECTED -> Posso accedere in lettura e scrittura dalla classe di appartenenza e dalle classi figlie
- PACKAGE -> E' la visibilità di default di ogni file, vuol dire visibile in lettura e scrittura solo all'interno del folder di appartenenza del file