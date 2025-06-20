/*
 * Auteur : Lorenzo OTTAVIANI.
 * Date : 20/06/2025 16h38
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

        RectangleColore recJaune = new RectangleColore(8,5,3);
        recJaune.setLargeur(6);
        System.out.println("La nouvelle longueur de mon rectangle jaune est : " + recJaune.getLargeur() + " cm.");
    }
}
