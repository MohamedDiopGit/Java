package biblio;
import jakarta.ejb.Remote;

@Remote
public interface IGestionLivre {
    public void nouveauLivre(String isbn, String titre);
}
