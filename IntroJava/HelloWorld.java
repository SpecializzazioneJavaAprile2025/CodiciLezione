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

        Scanner scanner = new Scanner(System.in); // Creazione di un oggetto Scanner
        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine(); // Leggi una linea di testo oppure nextInt() per i numeri
        System.out.println("Hai inserito: " + input);
        scanner.close(); // Chiudi lo scanner per rilasciare le risorse

    }
}