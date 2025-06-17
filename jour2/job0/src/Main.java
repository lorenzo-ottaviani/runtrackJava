/*
 * Auteur : Lorenzo OTTAVIANI.
 * Date : 18/06/2025 1h35
 * But de l'exercice :
 *    Analyse la classe Personnage.
 * Entrée : ∅
 * Sortie : Affichage du nom et prénom d'un objet Personnage.
 */

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Personne p = new Personne("Martin", "Jean", LocalDate.of(1990, 5, 20),
                "Paris", "123 rue de la Paix", "0612345678");

        System.out.println(p.prenom + " " + p.nom);
    }
}
