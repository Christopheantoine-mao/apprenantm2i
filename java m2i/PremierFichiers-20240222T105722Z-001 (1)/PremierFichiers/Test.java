// Java est Orienté Objet, on travail donc dans des classes
// Test est la classe principale car elle contient la méthode main
public class Test {

    // Pour l'instant, on n'ajoute pas d'attributs
    // On les placerait juste après la déclaration de la classe
    // Exemple : 
    // public int attribut 1 = 2;
    // public int boolean attribut2 = false


    /* 
     * La méthode main() est une méthode spéciale en Java 
     * qui marque le point de départ de l'exécution d'un programme Java. 
     * C'est là où le programme commence à s'exécuter. 
     * Chaque programme Java doit avoir une méthode main() pour pouvoir être exécuté.
     */

     /* On passera le mot clé static pour l'instant 
      * -> void signifie que la méthode ne renvoie aucune valeur
      * -> main est le nom de ma méthode il doit être exactement écrit de cette manière
      * -> String[] args est un paramètre obligatoire. Il s'agit d'un tableau de chaines de 
      * caractere qui contient les arguments passés au programmer à partir de la ligne de commande
      * On ne se servira pas de ceci, il faut simplement savoir que main est la méthode à partir
      * de laquelle le programme commence à s'exécuter
      */

    public static void main (String[]args) {
        // Première instruction de mon programme
        System.out.println("Hello World");
    }
}




