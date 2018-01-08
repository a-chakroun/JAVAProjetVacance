/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_vacances;

import java.util.ArrayList;

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
        
        
        Vehicule A = new Vehicule(3455,"BMW",0);
        Vehicule B = new Vehicule(6451,"Benz",0);
        Vehicule C = new Vehicule(5525,"Jeep",0);
        Vehicule D = new Vehicule(4567,"Chrystler",2);
        Vehicule E = new Vehicule(7852,"Fiat",1);
        Vehicule F = new Vehicule(4582,"Aston Martin",0);
        Vehicule G = new Vehicule(3258,"Peugeot",0);
        Vehicule H = new Vehicule(7859,"Tesla",2);
        
        Parc Vehicules = new Parc();
        
        Vehicules.AjouterV(A);
        Vehicules.AjouterV(B);
        Vehicules.AjouterV(C);
        Vehicules.AjouterV(D);
        
        Vehicules.AfficherTtVoit();
        Vehicules.ModifierV(3455,0);
        Vehicules.AfficherTtVoit();
        

        
       Client C1 = new Client (4545,"Amine","Chakroun","129 rue kadissya");
       System.out.println(C1.toString());
              
       Location Loc1 = new Location (A,C1,40); 
       EnsembleLocations reg = new EnsembleLocations();
       reg.AjouterLocation(Loc1);
       
        
        
        
        
    }   
}
