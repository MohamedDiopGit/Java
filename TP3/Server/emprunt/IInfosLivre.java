package emprunt;
import jakarta.ejb.Remote;
import java.util.List;

@Remote
public interface IInfosLivre {      // Interface for InfosLivre
    public String afficherTitre(String isbn);
    public List<LivreEmp> afficherToutLesTitres();
}
