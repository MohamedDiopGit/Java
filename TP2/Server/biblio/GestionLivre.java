package biblio;
import emprunt.IGestionEmprunt;
import emprunt.LivreEmp;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class GestionLivre implements IGestionEmprunt {   // Book Gestion 

    @PersistenceContext(unitName="biblioPu")
    protected EntityManager em;

    // Create a book in the database
    public void nouveauLivre(String isbn, String titre) {
        LivreEmp L = new LivreEmp(isbn, titre);
        em.persist(L);
        // System.out.println("New book created : " + isbn + " | " + titre);
    }

    // Delete a book from the database
    public void supprimerLivre(String isbn) {
        LivreEmp same = em.find(emprunt.LivreEmp.class,isbn); //managed same
        em.remove(same); // entity is removed

    }

    // Setters : set the availability of a book
    public void rendreLivre(String isbn) {
        LivreEmp same = em.find(emprunt.LivreEmp.class,isbn); //managed same
        LivreEmp L = new LivreEmp(same.isbn, same.titre, 1);
        em.remove(same); // entity is removed
        em.persist(L);
    }

    // Setters : set the availability of a book
    public void emprunterLivre(String isbn) {
        LivreEmp same = em.find(emprunt.LivreEmp.class,isbn); //managed same
        LivreEmp L = new LivreEmp(same.isbn, same.titre, 0);
        em.remove(same); // entity is removed
        em.persist(L);
    }
}



// @Stateful
// public class GestionLivre implements IGestionLivre {

//     @PersistenceContext(unitName="biblioPu")
//     protected EntityManager em;

//     Livre l = new Livre();

//     public void nouveauLivre(String isbn, String titre) {
//         l.isbn = isbn;
//         l.titre = titre;
//         em.persist(l);
//         // System.out.println("New book created : " + isbn + " | " + titre);
//     }

//     public void supprimerLivre(String isbn, String titre) {
//         em.remove(l);
//         // System.out.println("New book created : " + isbn + " | " + titre);
//     }
// }

