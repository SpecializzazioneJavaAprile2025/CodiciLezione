Nome del file:
- Segue le stesse regole della creazione di un nome di una classe:
    - Deve iniziare con una maiuscola
    - In inglese
    - Al singolare
    - Se composta da più parole camel case

Estensione
- .java -> inidica il file che contiene il codice

La classe
- Il suo nome deve corrispondere esattamente al nome del file

REGOLA PRINCIPALE
UN FILE UNA SOLA CLASSE

public class HelloWorld
public -> Modificatore d'accesso
class -> keyword che identifica una classe
nome -> segue le regole di sopra


public static void main(String[] args)
public -> Modificatore d'accesso
static -> vuol dire che il metodo in questione è indipendente dall'esistenza di una istanza della classe
void -> non ritorna alcun valore (non restituisce nulla)
main -> in un applicatiovo DEVE ESISTERE UN UNICO MAIN 
    - SOLO UNA CLASSE PUO' POSSEDERE QUESTO METODO
    - E' il punto principale di avvio di qualsiasi nostro applicativo

String[] args ->Parametro formale è un array di stringhe chiamato args

System.out.println -> Utilizzato per stampare a terminale quello che vogliamo

Type System
- Java si dice essere a tipizzazione statica e forte
- statica -> che il controllo del codice avviene a compile time
- forte -> vuol dire che sono costretto a dire tutto delle variabili e di ciò che restituisce una funzione SEMPRE
(il contrario è dinamico e debole)