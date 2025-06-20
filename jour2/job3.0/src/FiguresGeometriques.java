/**
 * La classe Rectangle représente un rectangle géométrique avec une longueur et une largeur.
 * Elle permet de calculer la surface du rectangle et de modifier ses dimensions.
 */
class Rectangle {
    protected double longueur;
    protected double largeur;

    /**
     * Constructeur de la classe Rectangle.
     *
     * @param longueur La longueur du rectangle.
     * @param largeur La largeur du rectangle.
     */
    Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    /**
     * Retourne la longueur du rectangle.
     *
     * @return La longueur.
     */
    public double getLongueur() {
        return longueur;
    }

    /**
     * Retourne la largeur du rectangle.
     *
     * @return La largeur.
     */
    public double getLargeur() {
        return largeur;
    }

    /**
     * Définit une nouvelle longueur pour le rectangle.
     *
     * @param nouvelleLongueur La nouvelle longueur à définir.
     */
    public void setLongueur(double nouvelleLongueur) {
        this.longueur = nouvelleLongueur;
    }

    /**
     * Définit une nouvelle largeur pour le rectangle.
     *
     * @param nouvelleLargeur La nouvelle largeur à définir.
     */
    public void setLargeur(double nouvelleLargeur) {
        this.largeur = nouvelleLargeur;
    }

    /**
     * Calcule et retourne la surface du rectangle.
     *
     * @return La surface du rectangle.
     */
    public double surface() {
        return this.longueur * this.largeur;
    }
}
