import javax.naming.InitialContext;
import javax.naming.NamingException;


public class Client {
    public static void main(String[] args){
        try{
            InitialContext initContext = new InitialContext();
            IBonjour ib = (IBonjour) initContext.lookup("IBonjour");
            System.out.println(ib.salut("Mohamed"));
            System.out.println(ib.resalut());
        }
        catch (NamingException e ){
            System.out.println(e.getMessage());
        }
    }
}

// java -cp "%CLASSPATH%;Exo1.jar" --add-opens java.base/java.lang=ALL-UNNAMED Client
// java:global/Exo1/Bonjour!IBonjour