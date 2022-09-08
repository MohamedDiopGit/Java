package emprunt;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "livre_emp")
public class LivreEmp {  // Entity of a book with information (availability,title, isbn)
    @Id String isbn;
    String titre;
    int empruntepar;

    public LivreEmp(){}

    public LivreEmp(String isbn, String titre, int empruntepar){
        this.isbn = isbn;
        this.titre = titre;
        this.empruntepar = empruntepar; 
    }
    

    public void setNumEmprunter(int numEmp){
        this.empruntepar = numEmp;     // Set the borrower number book
    }
}