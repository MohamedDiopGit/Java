package emprunt;
import jakarta.ejb.Remote;

@Remote
public interface IGestionEmprunt {   // Interface for GestionLivre   
    public void nouvelleSession(int numEmp);
    public void emprunterLivre(String isbn);
    public void rendreLivre(String isbn);
}
