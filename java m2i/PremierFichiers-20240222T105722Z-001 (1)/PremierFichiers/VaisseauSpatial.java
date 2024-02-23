// Exemple du cours

public class VaisseauSpatial {

    public String nom;
    private int etatProtection;

    public VaisseauSpatial(String pNom) {
        this.nom = pNom;
    }

    public String tirer() {
        return "Boom!";
    }

    public void reduireProtection(int quantite) {
        etatProtection = etatProtection - quantite;
    }

    public static void main(String[] args) {

        // Création de monVaisseau avec le mot clé "new". 
        // On passe en paramètre une chaine de caractère. Ici "jeremy"
        VaisseauSpatial monVaisseau = new VaisseauSpatial("Jeremy");

        // Mon objet est crée, je veux voir ce que contient mon attribut nom
        // Donc je l'affiche, il doit normalement contenir Jeremy
        System.out.println(monVaisseau.nom);
        

    }
}