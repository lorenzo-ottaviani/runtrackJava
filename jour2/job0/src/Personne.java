import java.time.LocalDate;

public class Personne {
    public String nom;
    public String prenom;
    protected LocalDate dateNaissance;
    protected String lieuNaissance;
    private String adresse;
    private String numeroTelephone;

    // Constructeur
    public Personne(String nom, String prenom, LocalDate dateNaissance, String lieuNaissance, String adresse,
             String numeroTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.lieuNaissance = lieuNaissance;
        this.adresse = adresse;
        this.numeroTelephone = numeroTelephone;
    }

    // Getters
    public LocalDate getDateNaissance() {
        return dateNaissance;
    }
    public String getLieuNaissance() {
        return lieuNaissance;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getNumeroTelephone() {
        return numeroTelephone;
    }

    // Setters
    public void setNom(String nouveauNom) {
        this.nom = nouveauNom;
    }

    public void setPrenom(String nouveauPrenom) {
        this.prenom = nouveauPrenom;
    }

    public void setDateNaissance(LocalDate nouvelleDateNaissance) {
        this.dateNaissance = nouvelleDateNaissance;
    }
    public void setLieuNaissance(String nouveauLieuNaissance) {
        this.lieuNaissance = nouveauLieuNaissance;
    }
    public void setAdresse(String nouvelleAdresse) {
        this.adresse = nouvelleAdresse;
    }
    public void setNumeroTelephone(String nouveauNumeroTelephone) {
        this.numeroTelephone = nouveauNumeroTelephone;
    }
}
