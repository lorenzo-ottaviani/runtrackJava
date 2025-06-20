/*
 * Auteur : Lorenzo OTTAVIANI.
 * Date : 20/06/2025 22h33
 * But de l'exercice :
 *    Vérifie si l'utilisateur est majeur.
 * Entrée : L'age.
 * Sortie : Affichage de la majorité ou de la minorité.
 */

import java.util.Scanner;

public class Main {
    public static String estMajeur(int age) {
        if(age < 18) {
            return "mineur";
        } else {
            return "majeur";
        }
    }

    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);

        System.out.print("Quel est ton âge ? ");
        int age = entree.nextInt();

        String majorite = estMajeur(age);

        System.out.print("Tu est : " + majorite + ".");

        entree.close();
    }
}