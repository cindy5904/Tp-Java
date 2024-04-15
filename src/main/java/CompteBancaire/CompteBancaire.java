package CompteBancaire;
import java.util.ArrayList;
import java.util.List;
public abstract class CompteBancaire {
    private double solde;
    private List<Operation> operations;
    private Client client;


    public CompteBancaire(double solde, Client client) {
        this.solde = solde;
        this.operations = new ArrayList<>();
        this.client = client;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }

}
