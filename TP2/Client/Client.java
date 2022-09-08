import javax.naming.InitialContext;
import javax.naming.NamingException;

import biblio.IGestionLivre;
import biblio.GestionLivre;
import biblio.Livre;

public class Client {
    
    public static void main(String[] args){
        try{
            InitialContext initContext = new InitialContext();
            IGestionLivre iGL = (IGestionLivre) initContext.lookup("IGestionLivre");
            iGL.nouveauLivre("444","Adventure of Me");
        }
        catch (NamingException e ){
            System.out.println(e.getMessage());
        }
    }
    
}
