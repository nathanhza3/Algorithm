
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        somme();
        division();
        volume();
        Scanner scanner = new Scanner(System.in);
        int unEntier = scanner.nextInt();
        float unReel = scanner.nextFloat();
        System.out.println("J’ai récuperé un entier: " + unEntier);
        System.out.println("J’ai aussi récuperé un reel: " + unReel);


        System.out.println("Bonjour, quel est votre prénom?");
        String prenom = scanner.nextLine();
        System.out.println("Bonjour " + prenom);
    }

    public static void somme () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        System.out.println("Veuillez saisir le deuxième entier");

        int premierEntier = scanner.nextInt();
        int deuxiemeEntier = scanner.nextInt();
        int somme = premierEntier + deuxiemeEntier;

        System.out.println("La somme de " + premierEntier + " avec " + deuxiemeEntier +
                " est égale à " + somme);


    }

    public static void division () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir le premier entier");
        System.out.println("Veuillez saisir le deuxieme entier");
        int premierEntier = scanner.nextInt();
        float deuxiemeEntier = scanner.nextFloat();
        float division = premierEntier / deuxiemeEntier;
        System.out.println("Le quotient de " + premierEntier + " avec " + deuxiemeEntier +
                "est egale a " + division);

    }

    public static void volume () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez saisir la longueur");
        System.out.println("Veuillez saisir la largeur");
        System.out.println("Veuillez saisir la hauteur");
        float longueur = scanner.nextFloat();
        float largeur = scanner.nextFloat();
        float hauteur = scanner.nextFloat();
        float volume = longueur*largeur*hauteur;
        System.out.println("Le volume du pavé "  +
                "est égale à " + volume);

    }

}