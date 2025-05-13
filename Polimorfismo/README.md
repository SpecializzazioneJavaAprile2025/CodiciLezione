Classe Astratta
- Descrizione generica
- Una classe si definisce astratta se possiede almeno un metodo astratto, di conseguenza una classe astratta può possedere anche metodi concreti
- Non posso istanziare una classe astratta poichè potremo istanziare solo le classi concrete figlie
- Erediterietà non avviene tra classi astratte


Funzioni
- Intestazione -> Firma del metodo
- Corpo -> Implementazione

Metodo astratto
- Modificatore di accesso
- Keyword abstract affinchè venga riconosciuta dal linguaggio come tale
- Tipo di ritorno del metodo
- Nome del metodo 
- Eventuali parametri
public abstract void displayInfo();

Il metodo stratto dice che la classe ha un comportamento
Il come me lo dirà la classe figlia

Il cosa ed il come
- Cosa -> definisce solo cosa si vuole definire
- Come -> come avvengono le cose

Annotazioni
Come ad esempio @Override si idicano con il "@" e non sono codice eseguibile, ed eseguito, ma sono direttive per il compilatore in tal modo che capisce quello che deve fare.
Nel nostro caso specifico va a fare "Override" del metodo cioè sovrascrive il metodo del padre definendo cose fa nello specifico

In java ogni nuova classe definisce un TIPO

UPCASTING
Assegno ad un parametro di tipo padre il valore di un oggetto di tipo figlio

Polimorfismo
- Polimorfo dal greco "molte forme" vuol dire proprio che un qualcosa si comporta im modo diverso a seconda di dove viene utilizzato, o chiamato, o nel caso delle funzioni si comporta diversamente a seconda dei parametri che riceve

Vantaggi
- Flessibilità -> codice facilmente adattabile
- Manutenibilità -> Un codice è facilmente gestibile
- Riutilibzzabilità del codice -> Principio DRY

Getters and Setters
- Sono metodi che ci permettono di avere acesso in lettura e scrittura ad attributi (fields) protetti o privati di una classe
- La potenza di questi metodi è proprio che sono metodi quindi posso personalizzarli al 100% ergo posso anche bloccare dall'esterno , ad esempio, l'accesso ai fields


Il polimorfismo in java viene proprio realizzato tramite classi Astratte e Interfacce