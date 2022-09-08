package emprunt;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Emprunteur {  // Entity of a borrower with his information
    @Id int numEmp; // ID of the borrower
    String nom;     // Name of the borrower
    int nbLivresEmp;        // Number of books borrowed 


    // Constructors
    public Emprunteur(){}
    public Emprunteur(int numEmp, String nom, int nbLivresEmp){
        this.numEmp = numEmp;
        this.nom = nom;
        this.nbLivresEmp = nbLivresEmp;
    }


    // Getters and setters
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