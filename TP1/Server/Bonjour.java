// import jakarta.ejb.Stateless;

import jakarta.ejb.Stateful;

// @Stateless
@Stateful
public class Bonjour implements IBonjour {
    // // Stateless method
    // public String salut(String nom){
    //     return "Bonjour à toi " + nomRetour + "!";
    // }

    // Stateful method
    private String nomRetour;
    public String salut(String nom){
        nomRetour = nom;
        return "Bonjour à toi " + nomRetour + "!";
    }

    public String resalut(){
        return "Rebonjour " + nomRetour +"!";
    }
}
