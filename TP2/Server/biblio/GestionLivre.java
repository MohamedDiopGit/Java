package biblio;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class GestionLivre implements IGestionLivre {

    @PersistenceContext(unitName="biblioPu")
    protected EntityManager em;

    public void nouveauLivre(String isbn, String titre) {
        Livre l = new Livre(isbn, titre);
        em.persist(l);
        // System.out.println("New book created : " + isbn + " | " + titre);
    }
}
