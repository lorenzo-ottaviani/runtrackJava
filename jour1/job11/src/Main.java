/*
 * Auteur : Lorenzo OTTAVIANI.
 * Date : 20/06/2025 22h48
 * But de l'exercice :
 *    Calcule la factorielle de n.
 * Entrée : L'entier n.
 * Sortie : Affichage de la factorielle.
 */

import java.util.Scanner;

public class Main {
    public static int factorielle(int seuil) {
        int total = 1;

        for(int i = 2; i <= seuil; i++) {
            total = i * total;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);

        System.out.print("Choisi un nombre entier : ");
        int n = entree.nextInt();

        int calcul = factorielle(n);

        System.out.print("La factorielle de " + n + " est : " + calcul + ".");
    }
}