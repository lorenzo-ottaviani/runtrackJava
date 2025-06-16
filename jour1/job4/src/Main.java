/*
 * Auteur : Lorenzo OTTAVIANI.
 * Date : 16/06/2025 23h37
 * But de l'exercice :
 *    Affiche le carré d'un nombre entré par l'utilisateur.
 * Entrée : ∅
 * Sortie : Affichage du carré du nombre.
 */

import java.util.Scanner;

public class Main {
    public static int carre(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);

        System.out.print("Choisi un nombre entier : ");
        int nombre = entree.nextInt();

        int nombreCarre = carre(nombre);

        System.out.print("Son carrée est : " + nombreCarre);
    }
}