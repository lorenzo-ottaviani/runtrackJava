/*
 * Auteur : Lorenzo OTTAVIANI.
 * Date : 20/06/2025 22h05
 * But de l'exercice :
 *    Calcule la somme des n premiers cubes.
 * Entrée : L'entier n.
 * Sortie : Affichage de la somme totale.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);

        System.out.print("Choisi un nombre entier : ");
        int n = entree.nextInt();

        int somme = (n * (n + 1) / 2);  // Somme arithmétique des nombres
        int sommeCubes = somme * somme;  // Carré de la somme arithmétique (équivaut à la somme des cubes des nombres)

        System.out.print("La somme des " + n + " premiers cubes est : " + sommeCubes);

        entree.close();
    }
}
