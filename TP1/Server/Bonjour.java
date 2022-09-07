// import jakarta.ejb.Stateless;
// @Stateless

import jakarta.ejb.Stateful;

@Stateful
public class Bonjour implements IBonjour {
    private String nomRetour;

    public String salut(String nom){
        nomRetour = nom;
        return "Bonjour à toi " + nomRetour + "!";
    }

    public String resalut(){
        return "Rebonjour " + nomRetour +"!";
    }
}
