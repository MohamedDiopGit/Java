package emprunt;
import jakarta.ejb.Remote;
import java.util.List;

@Remote
public interface IInfosLivre {
    public String afficherTitre(String isbn);
    public List<LivreEmp> afficherToutLesTitres();
}
