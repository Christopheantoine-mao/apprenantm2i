// Sous-classe (classe enfant)
public class Chien extends Animal {
    public void aboyer() {
        System.out.println("Le chien aboie.");
    }
    public static void main(String[] args) {
        Chien monChien = new Chien();
        monChien.manger(); // Utilisation de la méthode héritée de la classe parent
        monChien.aboyer(); // Utilisation de la méthode spécifique à la sous-classe
    }
}
