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

    public String afficherTitre(String ISBN){
        LivreEmp livre = em.find(emprunt.LivreEmp.class,ISBN); //s
        Query query = em.createQuery("SELECT titre FROM livre_emp WHERE isbn=:ISBN");
        List<emprunt.LivreEmp> listUsers = query.setParameter("ISBN",ISBN).getResultList();

        LivreEmp l = listUsers.get(0);
        return l.titre;
    }
    public String afficherToutLesTitres(){
        Query query = em.createQuery("SELECT titre FROM livre_emp WHERE empruntepar=0");
        List<emprunt.LivreEmp> listUsers = query.getResultList();
        return "ok";
    }

}
