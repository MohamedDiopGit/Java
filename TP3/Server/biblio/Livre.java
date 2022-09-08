package biblio;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Livre {  // Entity of a book with information (availability,title, isbn)
    @Id String isbn;
    String titre;
    int dispo;

    public Livre(){}
    public Livre(String isbn, String titre){
        this.isbn = isbn;
        this.titre = titre;
    }
    public Livre(String isbn, String titre, int dispo){
        this.isbn = isbn;
        this.titre = titre;
        this.dispo = dispo; 
    }
    
}