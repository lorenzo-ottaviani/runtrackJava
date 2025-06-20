/*
 * Auteur : Lorenzo OTTAVIANI.
 * Date : 20/06/2025 14h09
 * But de l'exercice :
 *    Manipuler des cercles.
 * Entrée : ∅
 * Sortie : Affiche des informations sur le cercle.
 */

public class Main {

    public static void main(String[] args) {
        Rectangle terrain = new Rectangle(12,8);
        double surfaceTerrain = terrain.surface();

        System.out.println("La surface de mon terrain est de : " + surfaceTerrain + " m².");

        Cercle cerceau = new Cercle(10,10,4);
        cerceau.affiche();
        boolean positionPoint = cerceau.estInterieur(25,20);
        System.out.println("La balle est à l'intérieur du cerceau ? " + positionPoint);

    }
}
