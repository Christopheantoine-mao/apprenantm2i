//Ma classe TP4 sert simplement à exécuter le code et les fonctions de mes autres classes 
//Dans le main (c'est à dire le programme principale executé), je peux créer des objets Exercice1, Exercice2 ...
////////////////////////////////////////////////////////////////////////////////////

// TP4.java


// Classe principale TP4
public class TP4 {
    public static void main(String[] args) {
        // Votre code ici...
    }
}

// Classe Exercice1 
class Exercice1 {
    public int somme(int nombre1, int nombre2) {
        return nombre1 + nombre2;
    }
}

// Classe Exercice2
class Exercice2 {
    public void afficherMois(int nombreMois) {
        // Votre code ici...

        if (nombreMois == 1) {
            System.out.println("Janvier");
        } else if (nombreMois == 2) {
            System.out.println("Février");
        } else if (nombreMois == 3) {
            System.out.println("Mars");
        } else if (nombreMois == 4) {
            System.out.println("Avril");
        } else if (nombreMois == 5) {
            System.out.println("Mai");
        } else if (nombreMois == 6) {
            System.out.println("Juin");
        } else if (nombreMois == 7) {
            System.out.println("Juillet");
        } else if (nombreMois == 8) {
            System.out.println("Août");
        } else if (nombreMois == 9) {
            System.out.println("Septembre");
        } else if (nombreMois == 10) {
            System.out.println("Octobre");
        } else if (nombreMois == 11) {
            System.out.println("Novembre");
        } else if (nombreMois == 12) {
            System.out.println("Décembre");
        } else {
            System.out.println("Nombre incorrect");
        }
    }
        }


        class MessageUtilisateur {
            public void afficherMessage(String message) {
                System.out.println(message);
            }
        }
        
        class Exercice3 {
            public static void main(String[] args) {
                MessageUtilisateur mu = new MessageUtilisateur();
                mu.afficherMessage("");
            }
        }
        









class Exercice4 {
    // Création fonction exercice 4...
    public class Main {
        public static void main(String[] args) {
            int age = 18; 
            
            if (age < 18) {
                System.out.println("Vous êtes mineur");
            } else if (age == 18) {
                System.out.println("Vous avez tout juste 18 ans");
            } else { // age > 18
                System.err.println("Vous êtes majeur");
            }
        }
    }
}
class Exercice5 {

    public class CalculSomme {
    
        public static void main(String[] args) {
            int n = 10; // Exemple : calculer la somme jusqu'à 10
            int resultat = calculerSomme(n);
            System.out.println("La somme de 1 à " + n + " est : " + resultat);
        }
        
        public static int calculerSomme(int n) {
            int somme = 0;
            for (int i = 1; i <= n; i++) {
                somme += i;
            }
            return somme;
        }
    }
    





    
}
class Exercice6 {
public void afficherTableau (int[]tab){
for (int i = 0; i < tab.length; i++) {


}
}

public void afficherValTab(int[] tab, int nombre3) {
    // Parcourir le tableau et afficher ses valeurs
    /*int[] tab = {1, 2, 3, 4, 5, 6, 7, 8, 9}; */

    for (int i = 0; i < tab.length; i++) {
        System.out.println(tab[i]);
    }


}
}
class Exercice7 {







    
}