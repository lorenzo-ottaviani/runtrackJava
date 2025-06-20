/*
 * Auteur : Lorenzo OTTAVIANI.
 * Date : 20/06/2025 22h42
 * But de l'exercice :
 *    Calcule la factorielle de 8.
 * Entrée : ∅
 * Sortie : Affichage de la factorielle.
 */

public class Main {
    public static int factorielle() {
        int total = 1;

        for(int i = 2; i <= 8; i++) {
            total = i * total;
        }

        return total;
    }

    public static void main(String[] args) {
        int calcul = factorielle();

        System.out.print("La factorielle de 8 est : " + calcul + ".");
    }
}