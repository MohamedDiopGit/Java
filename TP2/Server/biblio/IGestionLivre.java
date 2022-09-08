package biblio;
import jakarta.ejb.Remote;

@Remote
public interface IGestionLivre {   // Interface for GestionLivre   
    public void nouveauLivre(String isbn, String titre);
    public void supprimerLivre(String isbn);
    public void emprunterLivre(String isbn);
    public void rendreLivre(String isbn);
}
