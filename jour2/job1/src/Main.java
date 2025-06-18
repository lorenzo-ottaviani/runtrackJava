/*
 * Auteur : Lorenzo OTTAVIANI.
 * Date : 18/06/2025 15h34
 * But de l'exercice :
 *    Analyser les erreurs dans un programme donné.
 * Entrée : ∅
 * Sortie : Erreurs à la complication du programme.
 */

class Toto {
    static int toto = 0;

    Toto() {
       toto = toto +1;
    }

    public static void main(String[] tutu) {
        Toto t1 = new Toto();
        Toto t2 = new Toto();

        System.out.println("Toto : " + toto);
    }
}
