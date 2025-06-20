/**
 * La classe Figure définit une figure géométrique plane ainsi que son centre.
 * Elle permet de créer un schéma commun pour les classes Rectangle et Cercle.
 */
class Figure {
    protected double x;
    protected double y;

    /**
     * Constructeur de la classe Figure.
     *
     * @param x L'abscisse du centre O de la figure.
     * @param y L'ordonnée du centre O de la figure.
     */
    Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Retourne l'abscisse du centre O de la figure.
     *
     * @return L'abscisse du centre O de la figure.
     */
    public double getX() {
        return x;
    }

    /**
     * Retourne l'ordonnée du centre O de la figure.
     *
     * @return L'ordonnée du centre O de la figure.
     */
    public double getY() {
        return y;
    }

    /**
     * Définit un nouveau centre pour la figure.
     *
     * @param nouveauX La nouvelle abscisse du centre de la figure à définir.
     * @param nouveauY La nouvelle ordonnée du centre de la figure à définir.
     */
    public void setCentre(double nouveauX, double nouveauY) {
        this.x = nouveauX;
        this.y = nouveauY;
    }

    /**
     * Affiche les informations fondamentales sur la figure.
     * Elle indique les coordonnées de son centre O.
     */
    public void affiche() {
        System.out.println("Figure de centre O(" + this.x + ", " + this.y + ")");
    }
}

/**
 * La classe Rectangle représente un rectangle géométrique avec une longueur, une largeur et un centre.
 * Elle permet de calculer la surface du rectangle et de modifier ses dimensions.
 */
class Rectangle extends Figure {
    protected double longueur;
    protected double largeur;

    /**
     * Constructeur de la classe Rectangle.
     *
     * @param longueur La longueur du rectangle.
     * @param largeur La largeur du rectangle.
     */
    Rectangle(double x, double y, double longueur, double largeur) {
        super(x, y);
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
     * Affiche les informations fondamentales sur le rectangle.
     * Elle indique les coordonnées de son centre O, sa longueur et sa largeur.
     */
    public void affiche() {
        System.out.println("Rectangle de centre O(" + this.x + ", " + this.y + "), de longueur " + this.longueur +
                " m et de largeur " + this.largeur + " m." );
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
 * Classe représentant un rectangle possédant une couleur en plus de ses dimensions.
 * Elle hérite de la classe Rectangle et permet de colorer les rectangles.
 */
class RectangleColore extends Rectangle {
    private int couleur;

    /**
     * Constructeur de la classe RectangleColore.
     *
     * @param longueur La longueur du rectangle coloré.
     * @param largeur  La largeur du rectangle coloré.
     */
    RectangleColore(double x, double y, double longueur, double largeur, int couleur) {
        super(x, y, longueur, largeur);
        this.couleur = couleur;
    }

    /**
     * Retourne la couleur du rectangle.
     *
     * @return La couleur.
     */
    public int getCouleur() {
        return couleur;
    }

    /**
     * Définit une nouvelle couleur pour le rectangle.
     *
     * @param nouvelleCouleur La nouvelle couleur à définir.
     */
    public void setCouleur(int nouvelleCouleur) {
        this.couleur = nouvelleCouleur;
    }

    /**
     * Affiche les informations fondamentales sur le rectangle coloré.
     * Elle indique les coordonnées de son centre O, sa longueur, sa largeur et sa couleur.
     */
    public void affiche() {
        System.out.println("Rectangle de centre O(" + this.x + ", " + this.y + "), de longueur " + this.longueur +
                " m, de largeur " + this.largeur + " m et ayant la couleur numéro " + this.couleur + "." );
    }
}

/**
 * La classe Cercle représente un cercle géométrique avec un rayon et un centre O(x, y).
 * Elle permet de calculer la surface du cercle, de modifier ses dimensions et de
 * vérifier si un point et à l'intérieur du cercle.
 */
class Cercle extends Figure {
    protected double rayon;

    /**
     * Constructeur de la classe Cercle.
     *
     * @param x L'abscisse du centre O du cercle.
     * @param y L'ordonnée du centre O du cercle.
     * @param rayon Le rayon du cercle.
     */
    Cercle(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
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

/**
 * Classe représentant un cercle possédant une couleur en plus de ses dimensions.
 * Elle hérite de la classe Cercle et permet de colorer les cercles.
 */
class CercleColore extends Cercle {
    private int couleur;

    /**
     * Constructeur de la classe CercleColore.
     *
     * @param x L'abscisse du centre O du cercle coloré.
     * @param y L'ordonnée du centre O du cercle coloré.
     * @param rayon Le rayon du cercle coloré.
     */
    CercleColore(double x, double y, double rayon, int couleur) {
        super(x, y, rayon);
        this.couleur = couleur;
    }

    /**
     * Retourne la couleur du cercle.
     *
     * @return La couleur.
     */
    public int getCouleur() {
        return couleur;
    }

    /**
     * Définit une nouvelle couleur pour le cercle.
     *
     * @param nouvelleCouleur La nouvelle couleur à définir.
     */
    public void setCouleur(int nouvelleCouleur) {
        this.couleur = nouvelleCouleur;
    }

    /**
     * Affiche les informations fondamentales sur le cercle coloré.
     * Elle indique les coordonnées de son centre O, son rayon et sa couleur.
     */
    public void affiche() {
        System.out.println("Cercle de centre O(" + this.x + ", " + this.y + "), de rayon r = " + this.rayon
                + " et ayant la couleur numéro " + this.couleur + ".");
    }
}
