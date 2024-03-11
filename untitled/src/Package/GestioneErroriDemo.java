package Package;

public class GestioneErroriDemo {

    public static void main(String[] args) {
        try {
            System.out.println("Inizio del programma");
            int risultato = dividi(10, 0);
            System.out.println("Il risultato della divisione è: " + risultato);
        } catch (ArithmeticException e) {
            System.err.println("Errore: divisione per zero!");
            e.printStackTrace();
        }
    }

    public static int dividi(int dividendo, int divisore) {
        return dividendo / divisore;
    }
}
