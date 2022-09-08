import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;
// import emprunt.IGestionEmprunt;   // Uncomment if you want to use the GestionEmprunt
import emprunt.IInfosLivre;
import emprunt.LivreEmp;

public class Client {  // Client to communicate with the server
    
    public static void main(String[] args){
        try{
            InitialContext initContext = new InitialContext();

            /* GestionEmprunt  */
            // IGestionEmprunt iGE = (IGestionEmprunt) initContext.lookup("emprunt.IGestionEmprunt");

            // iGE.nouvelleSession(1);      // New session
            // iGE.emprunterLivre("444");


            /* InfosLivre */
            IInfosLivre iIL = (IInfosLivre) initContext.lookup("emprunt.IInfosLivre");
            List<LivreEmp> listLivres = iIL.afficherToutLesTitres();   
             
            // Display the list of available books
            for(int i = 0;i<= (listLivres.size()-1);i++){
                System.out.println(listLivres.get(i).titreLivre() + "\n\n");
            }
        }
        catch (NamingException e ){
            System.out.println(e.getMessage());
        }
    }
    
}


