/*
 * Auteur : Lorenzo OTTAVIANI.
 * Date : 17/06/2025 16h37
 * But de l'exercice :
 *    Affiche le maximum de trois nombres.
 * Entrée : Les trois nombres.
 * Sortie : Affichage du maximum.
 */

import java.util.Scanner;

public class Main {
    public static double maximum(double nb1, double nb2, double nb3) {
        if (nb1 > nb2) {
            if (nb1 > nb3) {
                return nb1;
            } else {
                return nb3;
            }
        } else if (nb2 > nb3) {
            return nb2;
        } else {
            return nb3;
        }
    }

    public static void main(String[] args) {
        Scanner entree = new Scanner(System.in);

        System.out.print("Choisi un premier nombre : ");
        double nombre1 = entree.nextDouble();

        System.out.print("Choisi un deuxième nombre : ");
        double nombre2 = entree.nextDouble();

        System.out.print("Choisi un troisième nombre : ");
        double nombre3 = entree.nextDouble();

        double nombreMaximum = maximum(nombre1, nombre2, nombre3);

        System.out.print("Son maximum est : " + nombreMaximum);

        entree.close();
    }
}
