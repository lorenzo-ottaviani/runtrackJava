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

/**
 * La classe Cercle représente un cercle géométrique avec un rayon et un centre O(x, y).
 * Elle permet de calculer la surface du cercle, de modifier ses dimensions et de
 * vérifier si un point et à l'intérieur du cercle.
 */
class Cercle {
    protected double x;
    protected double y;
    protected double rayon;

    /**
     * Constructeur de la classe Cercle.
     *
     * @param x L'abscisse du centre O du cercle.
     * @param y L'ordonnée du centre O du cercle.
     * @param rayon Le rayon du cercle.
     */
    Cercle(double x, double y, double rayon) {
        this.x = x;
        this.y = y;
        this.rayon = rayon;
    }

    /**
     * Retourne l'abscisse du centre O du cercle.
     *
     * @return L'abscisse du centre O du cercle.
     */
    public double getX() {
        return x;
    }

    /**
     * Retourne l'ordonnée du centre O du cercle.
     *
     * @return L'ordonnée du centre O du cercle.
     */
    public double getY() {
        return y;
    }

    /**
     * Retourne le rayon du cercle.
     *
     * @return Le rayon du cercle.
     */
    public double getRayon() {
        return rayon;
    }

    /**
     * Définit un nouveau centre pour le cercle.
     *
     * @param nouveauX La nouvelle abscisse du centre du cercle à définir.
     * @param nouveauY La nouvelle ordonnée du centre du cercle à définir.
     */
    public void setCentre(double nouveauX, double nouveauY) {
        this.x = nouveauX;
        this.y = nouveauY;
    }

    /**
     * Définit un nouveau rayon pour le cercle.
     *
     * @param nouveauRayon Le nouveau rayon à définir.
     */
    public void setRayon(double nouveauRayon) {
        this.rayon = nouveauRayon;
    }

    /**
     * Affiche les informations fondamentales sur le cercle.
     * Elle indique les coordonnées de son centre O et son rayon.
     */
    public void affiche() {
        System.out.println("Cercle de centre O(" + this.x + ", " + this.y + ") et de rayon r = " + this.rayon);
    }

    /**
     * Calcule et retourne la surface du cercle.
     *
     * @return La surface du cercle.
     */
    public double surface() {
        return this.rayon * this.rayon * Math.PI;
    }

    /**
     * Détermine si un point est à l'intérieur du cercle.
     *
     * @param pointX L'abscisse du point.
     * @param pointY L'ordonnée du point.
     * @return Un booléen qui indique si le point est à l'intérieur du cercle.
     */
    public boolean estInterieur(double pointX, double pointY) {
        double distance = Math.sqrt(Math.pow(pointX - this.x, 2) + Math.pow(pointY - this.y, 2));
        return distance < this.rayon;
    }
}
