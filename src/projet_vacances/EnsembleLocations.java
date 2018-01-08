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
       
        if((loc.getMontAv()>0)&&(loc.getV().getEtat()=="disponible")){
                
                
        Ens.add(loc);
        boolean d = Ens.contains(loc);
        if (d==true){ //verification de l'ajout de de la location
        System.out.println("Location Ajouté au registre");
        loc.getV().setEtat(1);
        }
        
    }else System.out.println("Votre Location ne s'est pas ajouté au registre"); }
    
    
    public void DeleteLocation (int cin,int matr ){
        
//        boolean isremoved = Ens.remove(loc);
//        System.out.println("La location est supprimé "+isremoved);
//        loc.getV().setEtat(0);
    }
    
    public void SearchLocation (int cin){
    
        
    }
    
}
