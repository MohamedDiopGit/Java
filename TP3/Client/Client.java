import javax.naming.InitialContext;
import javax.naming.NamingException;

import emprunt.IGestionEmprunt;

public class Client {  // Client to communicate with the server
    
    public static void main(String[] args){
        try{
            InitialContext initContext = new InitialContext();
            IGestionEmprunt iGE = (IGestionEmprunt) initContext.lookup("emprunt.IGestionEmprunt");
            iGE.nouvelleSession(1);
            iGE.emprunterLivre("444");
        }
        catch (NamingException e ){
            System.out.println(e.getMessage());
        }
    }
    
}


