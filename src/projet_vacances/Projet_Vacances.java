/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_vacances;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ExNihilo
 */
public class Projet_Vacances {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creation des voitures
        
        
       /* Vehicule A = new Vehicule(3455,"BMW",0);
        Vehicule B = new Vehicule(6451,"Benz",0);
        Vehicule C = new Vehicule(5525,"Jeep",0);
        Vehicule D = new Vehicule(4567,"Chrystler",2);
        Vehicule E = new Vehicule(7852,"Fiat",0);
        Vehicule F = new Vehicule(4582,"Aston Martin",0);
        Vehicule G = new Vehicule(3258,"Peugeot",0);
        Vehicule H = new Vehicule(7859,"Tesla",0);
        
        Parc Vehicules = new Parc();
        
        Vehicules.AjouterV(A);
        Vehicules.AjouterV(B);
        Vehicules.AjouterV(C);
        Vehicules.AjouterV(D);
        

        

        
       Client C1 = new Client (4545,"Amine","Chakroun","129 rue kadissya");
       Client C2 = new Client (1568,"Hedi","Chebbi","nowhere road");
       System.out.println(C1.toString());
              
       Location Loc1 = new Location (A,C1); 
       Location Loc2 = new Location (H,C2);
       
       EnsembleLocations reg = new EnsembleLocations();
       reg.AjouterLocation(Loc1);
       reg.AjouterLocation(Loc2);

        reg.SearchLocationCars(1568);
        reg.SearchLocationAll();
        
        reg.DeleteLocation(1568, 7859);
        
        
        reg.SearchLocationAll();*/
       
     MenuDemarrage();
        
    }


public static void MenuDemarrage(){     
       System.out.println(" _                         _    _                     _         _   _         _  _                           \n" +
"| |                       | |  (_)                   | |       | | | |       (_)| |                          \n" +
"| |      ___    ___  __ _ | |_  _   ___   _ __     __| |  ___  | | | |  ___   _ | |_  _   _  _ __  ___  ___  \n" +
"| |     / _ \\  / __|/ _` || __|| | / _ \\ | '_ \\   / _` | / _ \\ | | | | / _ \\ | || __|| | | || '__|/ _ \\/ __| \n" +
"| |____| (_) || (__| (_| || |_ | || (_) || | | | | (_| ||  __/ \\ \\_/ /| (_) || || |_ | |_| || |  |  __/\\__ \\ \n" +
"\\_____/ \\___/  \\___|\\__,_| \\__||_| \\___/ |_| |_|  \\__,_| \\___|  \\___/  \\___/ |_| \\__| \\__,_||_|   \\___||___/ \n" +
"                                                           Un projet par Ahmed Amine Chakroun et Hedi Chebbi          \n" +
"                                                                                                             ");
       

    Scanner reader = new Scanner(System.in);  // pour prendre le input



    System.out.println("Tapez :\n"
        + "1 : Pour la Gestion du parc de l’Agence\n"
        + "2 : Pour la Gestion des locations ");

    int n = reader.nextInt(); // Prendre le choix
    
    if(n==1){MenuGestParc();}
    else if (n==2){MenuGestLoc();}
    else {MenuDemarrage();}
}

public static void MenuGestParc(){

    Scanner reader = new Scanner(System.in);  // pour prendre le input

    System.out.println("   _____           _   _                   _         _____               \n" +
"  / ____|         | | (_)                 | |       |  __ \\              \n" +
" | |  __  ___  ___| |_ _  ___  _ __     __| |_   _  | |__) |_ _ _ __ ___ \n" +
" | | |_ |/ _ \\/ __| __| |/ _ \\| '_ \\   / _` | | | | |  ___/ _` | '__/ __|\n" +
" | |__| |  __/\\__ \\ |_| | (_) | | | | | (_| | |_| | | |  | (_| | | | (__ \n" +
"  \\_____|\\___||___/\\__|_|\\___/|_| |_|  \\__,_|\\__,_| |_|   \\__,_|_|  \\___|\n" +
"                                                                         \n" +
"                                                                         ");

    System.out.println("Tapez :\n"
            + "1 : Nouvelle acquisition\n"
            + "2 : Modification de l’état d’un véhicule\n"
            + "3 : Suppression d’un véhicule\n"
            + "4 : Consultation parc");

    int n = reader.nextInt(); // Prendre le choix
}

public static void MenuGestLoc(){
Scanner reader = new Scanner(System.in);  // pour prendre le input

    System.out.println("   _____           _   _                   _             _                     _   _                 \n" +
"  / ____|         | | (_)                 | |           | |                   | | (_)                \n" +
" | |  __  ___  ___| |_ _  ___  _ __     __| | ___  ___  | |     ___   ___ __ _| |_ _  ___  _ __  ___ \n" +
" | | |_ |/ _ \\/ __| __| |/ _ \\| '_ \\   / _` |/ _ \\/ __| | |    / _ \\ / __/ _` | __| |/ _ \\| '_ \\/ __|\n" +
" | |__| |  __/\\__ \\ |_| | (_) | | | | | (_| |  __/\\__ \\ | |___| (_) | (_| (_| | |_| | (_) | | | \\__ \\\n" +
"  \\_____|\\___||___/\\__|_|\\___/|_| |_|  \\__,_|\\___||___/ |______\\___/ \\___\\__,_|\\__|_|\\___/|_| |_|___/\n" +
"                                                                                                     \n" +
"                                                                                                     ");

  System.out.println("Tapez :\n"
            + "1 : Nouvelle location\n"
            + "2 : Fin de location\n"
            + "3 : Consultation des véhicules actuellement loués\n"
            + "4 : Consultation des véhicules loués par un client");

    int n = reader.nextInt(); // Prendre le choix}


}  

public static void NouvAcqui(){
    System.out.println("Veuillez saisir la matricule de votre voiture"
            + "suivie de sa marque et de son etat (Pour l'etat tapez"
            + "0 pour qu'elle soit disponible, 1 pour qu'elle soit loué"
            + "et 2 pour qu'elle soit en cours de réparation");
    
    Scanner reader = new Scanner(System.in);
    
    int matr=0;
    String Marq=null;
    int eta=0;
    Vehicule A = new Vehicule(matr,Marq,eta);
    
    
}





} 

