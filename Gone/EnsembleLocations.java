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
       
    public boolean AjouterLocation(Location loc) { //type de retour boolean pour verification apres
     //Nouvelle location (Ajout d’une location)  
     try{
        if((loc.getMontAv()>0)&&(loc.getV().getEtat()=="disponible")){
        //on verifie si le montant est sup a 0 et qu'elle est disponible        
                
        Ens.add(loc); //on l'ajoute au registre (Ens)
        boolean d = Ens.contains(loc);
        if (d==true){ //verification de l'ajout de de la location
        System.out.println("Location va s'Ajouter au registre");
        loc.getV().setEtat(1);
        return true;
        }
        
    }else {
            System.out.println("Votre Location ne s'est pas ajouté au registre");
             }
        }catch(java.lang.NullPointerException e){System.out.println("");}
        return false; //2 verification, ici dans la methode et aussi dans le main
    
    }
    public void DeleteLocation (int cin,int matr ){
        
        for(Location loc :Ens) {
            if((loc.getC().getCIN() == cin)&&(loc.getV().getMatricule() == matr))
                Ens.remove(loc);
            }
    }
    
    public void SearchLocationCars (int cin){
    //Consultation des véhicules loués par un client 

        for(Location loc :Ens){
            if(loc.getC().getCIN()==cin){
               System.out.println("Le client "+loc.getC().getNom()+" avec la CIN N="+loc.getC().getCIN()+" a loué "+loc.getV().toString());
                
            }
        }
    }
    
    public void SearchLocationAll (){
    //Consultation des véhicules actuellement loués 
        System.out.println("les voitures loués sont");
        for(Location loc :Ens){
            if (loc.getV().getEtat()=="loué"){
                System.out.print(loc.getV().toString());
                
            }
        }
    }
    

}