package TravailleurScientifique.Models;

public class Travailleur extends Personne{
    private String nomEntreprise;
    private String adresseEntreprise;
    private String telephoneProfessionnel;

    public Travailleur(String nom, String prenom, String numeroTel, String email, String nomEntreprise, String adresseEntreprise, String telephoneProfessionnel) {
        super(nom, prenom, numeroTel, email);
        this.nomEntreprise = nomEntreprise;
        this.adresseEntreprise = adresseEntreprise;
        this.telephoneProfessionnel = telephoneProfessionnel;
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getAdresseEntreprise() {
        return adresseEntreprise;
    }

    public void setAdresseEntreprise(String adresseEntreprise) {
        this.adresseEntreprise = adresseEntreprise;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Nom de l'entreprise: " + nomEntreprise + "\n" +
                "Adresse de l'entreprise: " + adresseEntreprise + "\n" +
                "Téléphone professionnel: " + telephoneProfessionnel;
    }

    public String getTelephoneProfessionnel() {
        return telephoneProfessionnel;
    }

    public void setTelephoneProfessionnel(String telephoneProfessionnel) {
        this.telephoneProfessionnel = telephoneProfessionnel;
    }
}
