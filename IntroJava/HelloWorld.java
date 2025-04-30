import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // System.out.println("Ciao a tutti benvenuti nel vostro primo programmino di Java!");

        // char c = "a";

        // System.out.println("ciao".isEmpty());

        // String ciccia = "cicciopasticcio";

        // int[] numeri = new int[5];

        // numeri[0] = 1;
        // numeri[1] = 2;
        // numeri[4] = 7;

        // System.out.println(args[0]);
        // System.out.println(args[1]);

        // Scanner scanner = new Scanner(System.in); // Creazione di un oggetto Scanner
        // System.out.print("Inserisci una stringa: ");
        // String input = scanner.nextLine(); // Leggi una linea di testo oppure nextInt() per i numeri
        // System.out.println("Hai inserito: " + input);
        // scanner.close(); // Chiudi lo scanner per rilasciare le risorse

        //Conversioni di tipo
        //cating espliciti
        byte b = 19;
        short x = (short) b;
        int i = (int) x;
        long l = (long) i;
        // System.out.println(l);
        double d = (double) i;
        // System.out.println(d);
        
        float f = 1.77f;
        double dd = (double)f;

        //conversione inutile
        char c = 'c';
        int cc = (int) c;

        // System.out.println(cc);

        //casting implicito
        int numeroIntero = 42;
        double numeroDouble = numeroIntero;

        //Casting tra tipi incompatibili
        String testo = "123";
        int numero = Integer.parseInt(testo);

        System.out.println(numero);

        // int j = null;
        Integer integer = null;

    }
}