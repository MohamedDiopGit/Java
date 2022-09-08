package biblio;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Stateless
public class GestionLivre implements IGestionLivre {   // Book Gestion 

    @PersistenceContext(unitName="biblioPu")
    protected EntityManager em;

    // Create a book in the database
    public void nouveauLivre(String isbn, String titre) {
        Livre L = new Livre(isbn, titre);
        em.persist(L);
        // System.out.println("New book created : " + isbn + " | " + titre);
    }

    // Delete a book from the database
    public void supprimerLivre(String isbn) {
        Livre same = em.find(biblio.Livre.class,isbn); //managed same
        em.remove(same); // entity is removed

    }

    // Setters : set the availability of a book
    public void rendreLivre(String isbn) {
        Livre same = em.find(biblio.Livre.class,isbn); //managed same
        em.remove(same); // entity is removed
        Livre L = new Livre(same.isbn, same.titre, 1);
        em.persist(L);
    }

    // Setters : set the availability of a book
    public void emprunterLivre(String isbn) {
        Livre same = em.find(biblio.Livre.class,isbn); //managed same
        em.remove(same); // entity is removed
        Livre L = new Livre(same.isbn, same.titre, 0);
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

