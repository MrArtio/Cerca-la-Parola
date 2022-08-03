import java.util.Scanner;

public class Main {
    public static class ContaOccorrenze {
        String testo;

        // Il costruttore inizializza il testo sul quale effettuare la ricerca
        public ContaOccorrenze(String txt){
            this.testo = txt;
        }

        // Il metodo conta acquisisce in input la parola da cercare
        public int conta(String parola){
            // Calcolo la lunghezza del testo e della parola
            int lunghezza_parola = parola.length();
            int lunghezza_testo = testo.length();

            // Definisco due variabili: un indice per il testo e un contatore
            int indice = 0;
            int numeroParole = 0;

            // Fin quando l'indice del testo è valido
            while (indice <= lunghezza_testo-lunghezza_parola){
                // Controllo se la substring del testo è uguale alla parola
                if(testo.subSequence(indice, indice+lunghezza_parola).equals(parola)){
                    numeroParole++;
                }
                // L'indice aumenta ad ogni iterazione
                indice++;
            }
            return numeroParole;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prendo in input un testo
        System.out.print("Scrivi un testo: ");
        String testo = in.nextLine();

        // Prendo in input una lettera da cercare nel testo
        System.out.print("Dammi una parola da ricercare e conteggiare: ");
        String parola = in.nextLine();

        // Istanzio l'oggetto ContaOccorrenze
        ContaOccorrenze contatore = new ContaOccorrenze(testo);
        // Invovo il metodo che restituisce il numero di occorrenze di parola in testo
        int occorrenze = contatore.conta(parola);
        System.out.println("La parola e' presente : ");
        System.out.println(occorrenze + " volte");
    }
}
