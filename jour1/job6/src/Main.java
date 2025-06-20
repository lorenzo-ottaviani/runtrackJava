/*
 * Auteur : Lorenzo OTTAVIANI.
 * Date : 20/06/2025 20h39
 * But de l'exercice :
 *    Affiche la moyenne de cinq nombres en utilisant que deux variables.
 * Entrée : Les cinq nombres.
 * Sortie : Affichage de la moyenne.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);

        System.out.print("Choisi un nombre : ");
        double nombre1 = entree.nextDouble();
        double nombre2;

        for(int i = 0; i < 4; i++) {
            System.out.print("Choisi un nombre : ");
            nombre2 = entree.nextDouble();
            nombre1 = nombre1 + nombre2;
        }

        nombre1 = nombre1 / 5;
        System.out.print("La moyenne des cinq nombres est : " + nombre1);

        entree.close();
    }
}
