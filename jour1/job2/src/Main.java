/*
 * Auteur : Lorenzo OTTAVIANI.
 * Date : 16/06/2025 22h39
 * But du programme :
 *    Afficher la phrase "Bonjour jolie {prénom entré par l'utilisateur}".
 * Entrée : Le prénom.
 * Sortie : Affichage de la phrase.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);

        System.out.print("Ton prénom est : ");
        String prenom = entree.nextLine();

        String bonjour = "Bonjour jolie";

        System.out.printf("%s %s",bonjour,prenom);

        entree.close();
    }
}