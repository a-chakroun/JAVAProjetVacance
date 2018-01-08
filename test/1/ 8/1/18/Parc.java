/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_vacances;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author ExNihilo
 */
public class Parc {
      
   private ArrayList<Vehicule> Vehicules;
    
   public Parc(){
  
     Vehicules = new ArrayList<Vehicule>();
           
           }
   
    
    public void AjouterV(Vehicule e){
        Vehicules.add(e);
        System.out.println("Vous avez ajouté la voiture "+e.getMatricule()+" à votre Parc");
    }
    
    public void AfficherTtVoit(){
        System.out.println("Maintenant dans le parc on a : \n"+Vehicules);
    }
    
    
    public void SuppressionMat(int mat){
        for(Iterator<Vehicule> iterator = Vehicules.iterator();
                iterator.hasNext(); ) {
            if(iterator.next().getMatricule() == mat)
                iterator.remove();
            }
        
    }
    
    
 public void ModifierV(int mat, int et){
    
        for(Vehicule V :Vehicules){
            if(V.getMatricule()==mat){
                V.setEtat(et);
                int maaat=Vehicules.indexOf(V);
                Vehicules.set(maaat, V);
            }
        }}}
    


