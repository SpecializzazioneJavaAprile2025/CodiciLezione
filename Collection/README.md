# Collezioni insiemi di elementi, sempre dello stesso tipo,ma che ci facilitano la gestioni di questi.

# Metodi delle collection
- add -> ci cinsente di aggiungere un elemento in coda di una collection
    public boolean add(Object o); 
- addAll -> ci permette di aggingere una intera collection
    public boolean addAll(Collection c);
- clear -> pulisce la collection
    public void clear();
- contains -> ci consente di verificare la presenza di un dato oggetto
    public boolean contains(Object o)
- containsAll -> ci consente di verificare se è presente una intera collection
    public boolean containsAll(Collection c);
- isEmpty -> verifica se una collection è vuota
    public boolean isEmpty();
- remove -> rimuove un elemento dalla collection
    public boolean remove(Object o)
- removeAll -> rimuove una intera collection
    public boolean removeAll(Collection c)
- size -> restituisce la dimensione della collection
    public int size();
- toArray -> restituisce una collection come array
    public Object[] toArray();

Collection possiamo anche dire che definisce una tipologia di dato sui quali possiamo applicare questi metodi
Ovviamente tutti i metodi fanno parte di una interfaccia che li contiene di conseguenza esisteranno delle classi specifiche che li implementerà

List (è la collection)
List allora è una interfaccia

ArrayList
In un ArrayList gli elementi sono memorizzati in locazioni contigue di memoria
E' una lista che segue le regole degli array

java.util
e' il pacchetto di utilità di java, contiente tutte le strutture e metodi principali

ITERABLE
le collection implementano una interfaccia chiamata Iterable.
Questa interfaccia possiede due metodi specifici:
- hasNext() -> è un metodo che ritorna un booleano, indica se l'eleemnto corrente possiede un successivo, nel caso del primo elemento e SOLO E SOLTANTO NEL CASO DEL PRIMO ELEMENTO si riferisce al primo
- next() -> next invece restituisce l'elemento corrente 


Federica Mudu 21 , Alessandro Russo 27 ,Gianmarco Nacci 17, Francesca Coduti 23

Un ArrayList -> più veloce in lettura ma non in scrittura

LinkedList
Gli elementi di una lista collegata non sono memorizzati in locazioni contigue ma sparsi in memoria
La linked list è moooolto veloce in scrittura meno in lettura


SET (Insieme)
Un insieme non può contenere due dati uguali
HashSet
- Controlla se due dati sono uguali utilizzando i metodi Equals ed HashCode
- Questa struttura utilizza i metodi equals e hashCode per il controllo di duplicati
TreeSet
- E' un insieme che utilizza gli alberi come regole
- Utilizza un oggetto chiamato comparator per il controllo di duplicati


Le map non vengono definite colleztion
Map (mappa chiave valore)
HashMap
- Controlla se due dati sono uguali utilizzando i metodi Equals ed HashCode
- Questa struttura utilizza i metodi equals e hashCode per il controllo di duplicati
TreeMap
- Utilizza un oggetto chiamato comparator per il controllo di duplicati



@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((cf == null) ? 0 : cf.hashCode());
    result = prime * result + progressivo;
    return result;
}