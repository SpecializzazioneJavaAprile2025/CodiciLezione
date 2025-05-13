Paradigma di programmazione -> Un modo per risolvere un problema


Paradigma imperativo
- E' il più utilizzato
- Il programmatore scrive il codice dettagliando passo dopo passo le operazioni che devono essere eseguite per risolvere un problema

Paradigma dichiarativo
- Viene utilizzata una filosofia differente
- non è il programmatore a definire i passaggi logici dell'algoritmo, ma piuttosto indica il risultato che vuole ottenere ma tutta l'implementazione interna dei passaggi che portano al risultato è delegato al linguaggio.
- Ne fa parte il paradigma funzionale

Il cosa ed il come
- come -> lo abbiamo appena fatto, cioè abbiamo detto noi come arrivare al risultato
- cosa -> non ci interessa come vengono effettuati i passaggi logici ma ci interessa COSA VOGLIAMO


NOTATE BENE
- NON TUTTO PUò ESSERE RISOLTO CON LA PROGRAMMAZIONE FUNZIONALE

Stream
- Nella metodologia funzionale non possiamo ciclare gli elementi di una lista senza APRIRE UNO STREAM
- Uno Stream è semplicemnte un FLUSSO DI DATI

Funzioni pure
- Non modificano lo stato iniziale di un dato

public int sum(int i, int j){
    return i + j;
}

Funzioni non pure
- Modificano lo stato iniziale di un dato

public void sum(int i, int j){
    int sum = i + j;
    i++;
    j++;
}

Lambda Function
- lambda expression

filter(person->person.gender.equals(Gender.FEMALE))

filter -> è il nome del metodo (funzione di ordine superiore)
person->person.gender.equals(Gender.FEMALE) -> è l'espressione (potremmo chiamarla una funzione anonima) 

parametro -> espressione

public Person females(Person person){
    return person.gender.equals(Gender.FEMALE);
}

Type inference
- num -> num * 2; -> moltiplica per 2 il numero ricevuto come parametro
No type inference
- (int num) -> num * 2;
Una lambda potrebbe aver bisogno di più parametri
- (parameter 1, perameter 2)->{
    code....;
    return something;
    }