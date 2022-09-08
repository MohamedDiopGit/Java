package emprunt;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.List;

@Stateless
public class InfosLivre implements IInfosLivre{
    
    @PersistenceContext(unitName="biblioPu")
    protected EntityManager em;  // EntityManager object


    // Display name of the books
    public String afficherTitre(String ISBN){
        LivreEmp livre = em.find(emprunt.LivreEmp.class,ISBN); 
        Query query = em.createQuery("SELECT livre FROM LivreEmp AS livre WHERE livre.isbn=:ISBN");
        
        List<emprunt.LivreEmp> listLivres = query.setParameter("ISBN",ISBN).getResultList();

        LivreEmp l = listLivres.get(0);
        return l.titreLivre();
    }

    // Display the list of all available books
    public List<LivreEmp> afficherToutLesTitres(){
        Query query = em.createQuery("SELECT livre FROM LivreEmp AS livre WHERE livre.empruntepar=0");
        List<emprunt.LivreEmp> listLivres = query.getResultList();

        return listLivres;
    }

}
