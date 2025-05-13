Dominio -> Di cosa voglio trattare, l'argomento

Classe -> Descrizione si come sarà la cosa reale che andrò a  manipolare
Proprietà -> Sono caratteistiche fondamentali della cosa reale

Tutti i file all'interno dello stesso folder(package) si vedono tra di loro

Ogetto -> Una istanza di una classe
Istanza -> cosa reale da poter manipolare

Costruttore -> Ha il compito principale di inizializzare gli attributi di una classe, se la classe non ha attributi i costruttori possono esere omessi

OVERLOADING (Sovraccarico)
In java posso scrivere una funzione cosi come un costruttore con lo stesso nome, l'importante è che i parametri siano diversi

Object renference (rifermento all'oggetto)

Side Effect
Effettuare cambiamenti di un determinato dato dall'esterno del blocco in cui è dichiarato ed inizializzato
Modifica della stato di qualcosa nel nostro siistema, se una cosa nasce in un determinato modo non deve essere main cambiata, se viene cambiata avviene il side effect

Funzioni impure
- Creano side effects (es la nostra main)

Fuzione pura
- Non genra side effects


Ereditarietà
- possiamo definiral come estensione di caratteristiche di una classe padre


OOP nasce anche per risolvere l'esigenze di dare realtà digitale a cose facenti parte di uno specifico dominio

Dominio = Scuola

== E equals(Object o) si comportano nello stesso ed identico modo, controllano se le reference sono uguali

Object Equality e Object Identity

Public -> Accessibile in lettura e scrittura da qualunque parte del codice
Private -> Accessibile in lettura e scrittura solo all'interno della classe in cui è dichiarata la funzione o l'attributo
Protected -> Accessibile in lettura e scrittura all'interno della classe in cui sono dichiarati e tutti i figli
Package -> Accessibile in lettura e scrittura solo dall'interno del folder in cui sono dichirati (questa visibilità è di default)