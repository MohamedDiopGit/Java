package emprunt;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import java.io.Serializable;  // Serializable for the List of object 'listLivres' in Client.

@Entity
@Table(name = "livre_emp")
public class LivreEmp implements Serializable{  // Entity of a book with information (availability,title, isbn)
    @Id String isbn;    // ISBN number
    String titre;       // Title of the book
    int empruntepar;    // Id of the book borrower

    // Constructors
    public LivreEmp(){}
    public LivreEmp(String isbn, String titre, int empruntepar){
        this.isbn = isbn;
        this.titre = titre;
        this.empruntepar = empruntepar; 
    }
    
    // Getter and setter methods
    public String titreLivre(){
        return this.titre;      // Return the book title
    }
    public void setNumEmprunter(int numEmp){
        this.empruntepar = numEmp;     // Set the borrower number book
    }
}