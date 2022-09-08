import javax.naming.InitialContext;
import javax.naming.NamingException;

import biblio.IGestionLivre;

public class Client {
    
    public static void main(String[] args){
        try{
            InitialContext initContext = new InitialContext();
            IGestionLivre iGL = (IGestionLivre) initContext.lookup("biblio.IGestionLivre");
            iGL.nouveauLivre("444","Adventure of Me");
            iGL.supprimerLivre("444","Adventure of Me");
        }
        catch (NamingException e ){
            System.out.println(e.getMessage());
        }
    }
    
}


