/*
 * Auteur : Lorenzo OTTAVIANI.
 * Date : 16/06/2025 22h17
 * But de l'exercice :
 *    Afficher un nom et un âge entrés par l'utilisateur.
 * Entrée : Le nom et l'âge.
 * Sortie : Affichage des variables.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);

        System.out.print("Ton nom est : ");
        String nom = entree.nextLine();

        System.out.print("Ton âge est : ");
        int age = entree.nextInt();

        System.out.printf("%s %d",nom,age);

        entree.close();
    }
}