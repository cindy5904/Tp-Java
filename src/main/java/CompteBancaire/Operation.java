package CompteBancaire;

public class Operation {
    private int numero;
    private double montant;
    private StatutOperation statut;
    public enum StatutOperation {
        DEPOT,
        RETRAIT,
    }
    public Operation(int numero, double montant, StatutOperation statut) {
        this.numero = numero;
        this.montant = montant;
        this.statut = statut;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public StatutOperation getStatut() {
        return statut;
    }

    public void setStatut(StatutOperation statut) {
        this.statut = statut;
    }
}
