/*
 * Auteur : Lorenzo OTTAVIANI.
 * Date : 16/06/2025 23h37
 * But du programme :
 *    Créer un tableau contenant les 10 chiffres dans l'ordre croissant.
 * Entrée : ∅
 * Sortie : Affichage de certains des nombres du tableau.
 */

public class Main {
    public static void main(String[] args) {
        // Option 1 : déclaration préalable
        int[] entierBis = new int[10];
        for (int i = 0; i < 10; i ++) {
            entierBis[i] = i;
        }

        System.out.println(entierBis[4]);

        // Option 2 : affectation directe des valeurs
        int[] entier = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(entier[0]);
        System.out.println(entier[1]);
        System.out.println(entier[5]);
        System.out.println(entier[9]);
        // System.out.print(entier[10]); index trop grand !
    }
}