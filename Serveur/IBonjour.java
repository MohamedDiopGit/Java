import jakarta.ejb.Remote;

@Remote
public interface IBonjour{
    public String salut(String nom);
    public String resalut();
}

