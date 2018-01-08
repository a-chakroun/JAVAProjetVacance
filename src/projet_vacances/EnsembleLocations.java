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
    
    public void SearchLocationCars (int cin){
    
        for(Location loc :Ens){
            if(loc.getC().getCIN()==cin){
               System.out.println("Le client "+loc.getC().getNom()+" avec la CIN N="+loc.getC().getCIN()+" a loué "+loc.getV().toString());
                
            }              
    
        }
    }
    
    public void SearchLocationAll (){
        for(Location loc :Ens){
            if (loc.getV().getEtat()=="loué"){
                System.out.println("les voitures loués sont"+loc.getV().toString());
                
            }
        }
    }
}