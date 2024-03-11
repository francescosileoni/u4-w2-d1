package es2;


import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GestioneArray {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[5];


        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }


        stampaArray(array);


        int numeroInserito = 0;
        do {
            try {

                System.out.print("Inserisci un numero (0 per terminare): ");
                numeroInserito = scanner.nextInt();

                if (numeroInserito != 0) {

                    System.out.print("Inserisci la posizione dell'array (da 1 a 5): ");
                    int posizione = scanner.nextInt();


                    if (posizione < 1 || posizione > 5) {
                        throw new ArrayIndexOutOfBoundsException("Posizione non valida");
                    }


                    array[posizione - 1] = numeroInserito;


                    stampaArray(array);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Errore: Posizione non valida. Inserisci una posizione tra 1 e 5.");
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.err.println("Errore: Inserire un numero valido.");
                scanner.nextLine();
            }
        } while (numeroInserito != 0);

        System.out.println("Programma terminato.");
        scanner.close();
    }


    private static void stampaArray(int[] array) {
        System.out.print("Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


