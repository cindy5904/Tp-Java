package TravailleurScientifique.Models;

public class Scientifique extends Travailleur{
    private String discipline;
    private String typeScientifique;

    public Scientifique(String nom, String prenom, String numeroTel, String email, String nomEntreprise,
                        String adresseEntreprise, String telephoneProfessionnel, String discipline, String typeScientifique) {
        super(nom, prenom, numeroTel, email, nomEntreprise, adresseEntreprise, telephoneProfessionnel);
        this.discipline = discipline;
        this.typeScientifique = typeScientifique;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public String getTypeScientifique() {
        return typeScientifique;
    }

    public void setTypeScientifique(String typeScientifique) {
        this.typeScientifique = typeScientifique;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Discipline: " + discipline + "\n" +
                "Type de scientifique: " + typeScientifique;
    }
}
