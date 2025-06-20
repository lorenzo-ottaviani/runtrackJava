/*
 * Auteur : Lorenzo OTTAVIANI.
 * Date : 18/06/2025 22h40
 * But de l'exercice :
 *    Manipuler des rectangles.
 * Entrée : ∅
 * Sortie : Affiche la surface de mon rectangle.
 */

public class Main {

    public static void main(String[] args) {
        Rectangle terrain = new Rectangle(12,8);

        double surfaceTerrain = terrain.surface();

        System.out.println("La surface de mon terrain est de : " + surfaceTerrain + " m².");
    }
}
