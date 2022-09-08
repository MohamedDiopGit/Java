package emprunt;
import jakarta.ejb.Stateful;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateful
public class GestionEmprunt implements IGestionEmprunt {   // Book Gestion 

    @PersistenceContext(unitName="biblioPu")
    protected EntityManager em;  // EntityManager object

    private Emprunteur emp;  // Borrower

    // Setters : set the borrower session
    public void nouvelleSession(int numEmp){
        emp = em.find(emprunt.Emprunteur.class,numEmp); // Find the borrower
    }


    // Setters : set the availability of a book
    public void rendreLivre(String isbn) {
        LivreEmp livre = em.find(emprunt.LivreEmp.class,isbn); //Find the book 
        livre.setNumEmprunter(0);
        em.merge(livre); // entity is removed and deleted in the server 
        emp.decrementNBLivresEmp();
        em.merge(emp);
    }

    // Setters : set the availability of a book
    public void emprunterLivre(String isbn) {
        LivreEmp livre = em.find(emprunt.LivreEmp.class,isbn); //Find the book 
        livre.setNumEmprunter(emp.getNumEmp());
        em.merge(livre); // entity is removed and deleted in the server 

        emp.incrementNBLivresEmp();
        em.merge(emp);
    }
}


