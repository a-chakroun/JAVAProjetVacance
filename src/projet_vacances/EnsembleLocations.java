package projet_vacances;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author AhmedAmine
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
        
        for(Location loc :Ens) {
            if((loc.getC().getCIN() == cin)&&(loc.getV().getMatricule() == matr))
                Ens.remove(loc);
            }
    }
    
    public void SearchLocationCars (int cin){
    
        for(Location loc :Ens){
            if(loc.getC().getCIN()==cin){
               System.out.println("Le client "+loc.getC().getNom()+" avec la CIN N="+loc.getC().getCIN()+" a loué "+loc.getV().toString());
                
            }
        }
    }
    
    public void SearchLocationAll (){
        System.out.println("les voitures loués sont");
        for(Location loc :Ens){
            if (loc.getV().getEtat()=="loué"){
                System.out.print(loc.getV().toString());
                
            }
        }
    }
}