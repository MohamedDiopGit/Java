package biblio;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Livre {
    @Id String isbn;
    String titre;
    int dispo;

    public Livre(){}
    public Livre(String isbn, String titre){
        this.isbn = isbn;
        this.titre = titre;
    }
    
}