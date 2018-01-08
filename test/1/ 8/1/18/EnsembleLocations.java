/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_vacances;

import java.util.HashSet;

/**
 *
 * @author ExNihilo
 */
public class EnsembleLocations {
    private HashSet<Location> Ens;
    
    
    public EnsembleLocations(){
        Ens = new HashSet<Location>();
           }
       
    public void AjouterLocation(Location loc) {
       
        Ens.add(loc);
        boolean d = Ens.contains(loc);
        if (d==true){ //verification de l'ajout de de la location
        System.out.println("Location Ajouté au registre");
        }
        else System.out.println("Votre Location ne s'est pas ajouté au registre");
    }
}
