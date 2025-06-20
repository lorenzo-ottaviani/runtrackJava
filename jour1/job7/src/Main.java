/*
 * Auteur : Lorenzo OTTAVIANI.
 * Date : 20/06/2025 20h39
 * But de l'exercice :
 *    Calcule la somme des cent premiers entiers.
 * Entrée : ∅
 * Sortie : Affichage de la somme totale.
 */

public class Main {

    public static void main(String[] args) {
        int nombre1 = 0;

        for(int i = 1; i <= 100; i++) {
            nombre1 = nombre1 + i;
        }

        System.out.print("La somme des cent premiers entiers est : " + nombre1);
    }
}
