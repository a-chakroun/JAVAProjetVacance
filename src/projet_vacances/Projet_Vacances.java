
package projet_vacances;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author AhmedAmine
 */
public class Projet_Vacances {
   static Parc Vehicules = new Parc();
   static EnsembleLocations reg = new EnsembleLocations();
   static Scanner re1 = new Scanner(System.in);
   static Scanner re2 = new Scanner(System.in);
   static Scanner re3 = new Scanner(System.in);
   static Scanner reader = new Scanner(System.in); 

   public static void RetourMenuPrincipal(){ //au debut j'ai ecris ces lignes de codes dans toutes les fonction,
                                             //puis ça m'a frappé, pourquoi ne pas faire une fonction que j'appellerais chaque fois que
                                             //j'en aurais besoin si je ne peut pas ou je ne veux pas appeler directement MenuDemarrage()
                                             //avec l'exception InputMismatchException quand on tape quelque chose d'autre q'un integer
    try{//Scanner reader = new Scanner(System.in);
    System.out.println("\n\nTaper n'importe quel bouton puis entrer");
        int n = reader.nextInt(); 
        switch (n) {
            case 1:
                MenuDemarrage();
                  break;
            default:
                MenuDemarrage();
                break;}

}catch(java.util.InputMismatchException e){
System.out.println("S'il vout plais veuillez taper un chiffre.");
MenuDemarrage();}}
   
   
public static void MenuDemarrage(){  
    
    
    System.out.println(
"      _                      ______________                _\n" +
" ____//]_________       ____//__]| karhba |         ______//________\n" +
"(o _ |  -|  _  o|      (o _ |   -|  _  _  |        /o _   |  -| _   \\\n" +
" `(_)------(_)--'       `(_)-----'-(_)(_)-'        `-(_)-------(_)---'");
    
    
       System.out.println(" _                         _    _                     _         _   _         _  _                           \n" +
"| |                       | |  (_)                   | |       | | | |       (_)| |                          \n" +
"| |      ___    ___  __ _ | |_  _   ___   _ __     __| |  ___  | | | |  ___   _ | |_  _   _  _ __  ___  ___  \n" +
"| |     / _ \\  / __|/ _` || __|| | / _ \\ | '_ \\   / _` | / _ \\ | | | | / _ \\ | || __|| | | || '__|/ _ \\/ __| \n" +
"| |____| (_) || (__| (_| || |_ | || (_) || | | | | (_| ||  __/ \\ \\_/ /| (_) || || |_ | |_| || |  |  __/\\__ \\ \n" +
"\\_____/ \\___/  \\___|\\__,_| \\__||_| \\___/ |_| |_|  \\__,_| \\___|  \\___/  \\___/ |_| \\__| \\__,_||_|   \\___||___/ \n" +
"                                                           Un projet par Ahmed Amine Chakroun et Hedi Chebbi          \n" +
"                                                                                                             ");
       

  //  Scanner reader = new Scanner(System.in);  // pour prendre le input



    System.out.println("Tapez :\n"
        + "1 : Pour la Gestion du parc de l’Agence\n"
        + "2 : Pour la Gestion des locations ");

    int n = reader.nextInt(); // Prendre le choix
        switch (n) {
            case 1:
                MenuGestParc();
                break;
            case 2:
                MenuGestLoc();
                break;
            default:
                MenuDemarrage();
                break;
        }
}

public static void MenuGestParc(){

   // Scanner reader = new Scanner(System.in);  // pour prendre le input

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
            + "4 : Consultation parc\n"
            + "0 : retour vers le menu demarrage\n");

    int n = reader.nextInt(); // faire le choix

        switch (n) {
            case 0:
                MenuDemarrage();
                break;
            case 1:
                NouvAcqui();
                break;
            case 2:
                ModifEtatVehic();
                break;
            case 3:
                SuppVehic();
                break;
            case 4:
                ConsParc();
                break;    
            default:
                MenuGestParc();
                break;
        }
}

public static void MenuGestLoc(){


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
            + "4 : Consultation des véhicules loués par un client\n"
//            + "5 : Ajout de Client "
            + "0 : retour vers le menu demarrage\n");

    int n = reader.nextInt(); 

     switch (n) {
         
            case 0:
                MenuDemarrage();
                break;
            case 1:
                NouvLoc();
                break;
            case 2:
                FinLoc();
                break;
            case 3:
                ConsVehicLoueAll();
                break;
            case 4:
                ConsVehicLoueClient();
                break; 
//            case 5:
//                AjoutClient();
//                break; 
            default:
                MenuGestLoc();
                break;
        }

}  

//Gestion du parc de l'agence

public static void NouvAcqui(){
    System.out.println("Nouvelle Acquisition - Ajout d’un véhicule");

    System.out.println("Veuillez saisir la matricule de votre voiture");
    int matr= re1.nextInt();
    System.out.println("Veuillez saisir la marque de votre voiture");
    String Marq= re2.nextLine();
    System.out.println("Veuillez saisir l'etat de votre voiture(Pour l'etat tapez"
            + " 0 pour qu'elle soit disponible\n, 1 pour qu'elle soit loué"
            + "et 2 pour qu'elle soit en cours de réparation)");
    try{
    int eta= re3.nextInt();
    
    Vehicule A = new Vehicule(matr,Marq,eta);
 
    Vehicules.AjouterV(A);
    
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Veuilez saisir un etat normal la prochaine fois");
        NouvAcqui();
        
    } 
 MenuDemarrage();
            
}

public static void ModifEtatVehic(){
    System.out.println("Modification de l’état d’un véhicule\n\n"
        + "Veuillez entrer un Numéro d’immatriculation ");
    //Scanner re1 = new Scanner(System.in);
    //Scanner re2 = new Scanner(System.in);
    int matr = re1.nextInt();
    System.out.println("Veuillez entrer:\n0 : pour disponible\n"
            + "1 : pour loué\n"
            + "2 : pour en cours de réparation");
    int et = re2.nextInt();
    Vehicules.ModifierV(matr, et);
    
MenuDemarrage();
}

public static void SuppVehic(){
    System.out.println("Suppression d’un véhicule\n\n");
    System.out.println("Veuillez entrer le Numéro d’immatriculation "
            + "de la voiture que vous voulez supprimer !");
     //   Scanner re1 = new Scanner(System.in);
        int matr = re1.nextInt();
        Vehicules.SuppressionMat(matr);
        MenuDemarrage();
}

public static void ConsParc(){
System.out.println("Consultation parc (tous les véhicules)\n\n ");

Vehicules.AfficherTtVoit();

System.out.println("Appuyer sur n'importe quel chiffre our revenir");
//try{
//Scanner reader = new Scanner(System.in);
//    int n = reader.nextInt(); 
//        switch (n) {
//            case 1:
//                MenuDemarrage();
//                  break;
//            default:
//                MenuDemarrage();
//                break;}
//
//}catch(java.util.InputMismatchException e){
//System.out.println("S'il vout plais veuillez taper un chiffre.");
//MenuDemarrage();}
RetourMenuPrincipal();
}

//Gestion des Location

public static void NouvLoc(){
    System.out.println("Nouvelle location - Ajout d’une location\n\n ");
    Client C = AjoutClient();
    System.out.println("Veuillez taper le numero de matriculation que vous voulez louer");
    int matr = reader.nextInt();
     Vehicule V = Vehicules.SearchCar(matr);
    
    if((V!=null)&&(C!=null)){
        Location Loc = new Location (V,C); 
        System.out.println("Location Crée");
        boolean A =reg.AjouterLocation(Loc);
        if (A==true){
            System.out.println("Location Ajouté");
        }else System.out.println("imposible d'ajouter cette location");
    }
       
MenuDemarrage();}

public static void FinLoc(){
    System.out.println("Fin de location - Suppression\n\n ");
    System.out.println("Veuillez taper le numero cin de la personne que vous allez supprimer");
    int cin = re1.nextInt();
    System.out.println("Veuillez taper le numero de matriculation la voiture que vous allez supprimer");
    int matr = re2.nextInt();
    
    reg.DeleteLocation(cin, matr);
    RetourMenuPrincipal();

}

public static void ConsVehicLoueAll(){
    System.out.println("Consultation des véhicules actuellement loués\n\n ");
    reg.SearchLocationAll();

    RetourMenuPrincipal();
}

public static void ConsVehicLoueClient(){
   
    System.out.println("Consultation des véhicules loués par un client\n\n ");
    System.out.println("Veuillez taper le cin du client que vous voulez verifier les locations");
    int cin = reader.nextInt();
    reg.SearchLocationCars(cin);

    RetourMenuPrincipal();
}


public static Client AjoutClient(){
   try{ System.out.println("Veuillez entrer un CIN pour votre client");
    int cin = reader.nextInt();
    System.out.println("Veuillez entrer un nom pour votre client");
    String nom = re1.nextLine();
    System.out.println("Veuillez entrer un prenom pour votre client");
    String prenom = re2.nextLine();
    System.out.println("Veuillez entrer une adresse pour votre client");
    String adresse = re3.nextLine();
 Client C1 = new Client (cin,nom,prenom,adresse);
 return C1;}catch(java.util.InputMismatchException e){ //exception quand le type fournit n'est pas le meme que celui qui demandé
     System.out.println("Veuillez entrer un type correspondant");
     return null;
 }
}


    
    public static void main(String[] args) {
        
        // Creation des voitures
        
        
        Vehicule A = new Vehicule(0,"BMW",0);
        Vehicule B = new Vehicule(1,"Benz",0);
        Vehicule C = new Vehicule(2,"Jeep",0);
        Vehicule D = new Vehicule(3,"Chrystler",2);
        Vehicule E = new Vehicule(4,"Fiat",0);
        Vehicule F = new Vehicule(5,"Aston Martin",0);
        Vehicule G = new Vehicule(6,"Peugeot",0);
        Vehicule H = new Vehicule(7,"Tesla",0);
        
        //Parc Vehicules = new Parc();  
        
        //je l'ai cree en haut comme étant static
        
        Vehicules.AjouterV(A);
        Vehicules.AjouterV(B);
        Vehicules.AjouterV(C);
        Vehicules.AjouterV(D);
        Vehicules.AjouterV(E);
        Vehicules.AjouterV(F);
        Vehicules.AjouterV(G);
        Vehicules.AjouterV(H);
        

        
        Vehicules.AfficherTtVoit();
        
       Client C1 = new Client (1,"Amine","Chakroun","129 rue kadissya");
       Client C2 = new Client (2,"Hedi","Chebbi","902 nowhere road");
       //System.out.println(C1.toString());
              
       Location Loc1 = new Location (A,C1); 
       Location Loc2 = new Location (H,C2);
       Location Loc3 = new Location (B,C1);
       
       reg.AjouterLocation(Loc1);
       reg.AjouterLocation(Loc2);
       reg.AjouterLocation(Loc3);

        reg.SearchLocationCars(1);
        
        
        //reg.DeleteLocation(1, 1);
        
        Loc1.Afficher();
        reg.SearchLocationAll();
       
     MenuDemarrage();
//     NouvAcqui(); //juste pour tester
        
    }




} 

