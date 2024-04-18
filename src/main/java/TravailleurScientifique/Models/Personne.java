package TravailleurScientifique.Models;

public abstract class Personne {
    private String nom;
    private String prenom;
    private String numeroTel;
    private String email;

    public Personne(String nom, String prenom, String numeroTel, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroTel = numeroTel;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", numeroTel='" + numeroTel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
