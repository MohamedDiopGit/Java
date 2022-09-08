package emprunt;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emprunteur {  // Entity of a borrower with information
    @Id int numEmp;
    String nom;
    int nbLivresEmp;

    public Emprunteur(){}
    public Emprunteur(int numEmp, String nom, int nbLivresEmp){
        this.numEmp = numEmp;
        this.nom = nom;
        this.nbLivresEmp = nbLivresEmp;
    }

    public int getNumEmp() {
        return this.numEmp;
    }

    public void decrementNBLivresEmp(){
        this.nbLivresEmp--;
    }
    public void incrementNBLivresEmp(){
        this.nbLivresEmp++;
    }

}