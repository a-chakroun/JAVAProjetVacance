package projet_vacances;

import static projet_vacances.Projet_Vacances.Vehicules;



/**
 *
 * @author AhmedAmine
 */
public class Vehicule {
    private int Matricule;
    private String Marque;
    private String[] Etat = {"disponible","loué","en cours de réparation"};
    private int Et;
    private String EtatV;
    
    //le constructeur du vehicule
    
    public Vehicule (int mat, String mar, int et)
    {
        
        boolean available = Vehicules.SearchCarB(mat);
        if (available){
        Matricule=mat;
        Marque=mar;
        EtatV= Etat[et];
        
        System.out.println("Vous avez construit une voiture de la marque "+Marque+", matriculé "+ Matricule+" et qui est "+EtatV );}
        else System.out.println("le Matricule "+mat+" existe deja !!!");
    }

    //les getters
    
    public String getMarque(){
        return Marque;
    }
            
    public int getMatricule()  {
        return Matricule;
    }     
    
    
    public String getEtat(){
        return EtatV;
    }
    
    
    //les setters
    
    public void setMarque(String mar){
       this.Marque=mar; }
    
    
    public void setMatricule(int mat){
        this.Matricule=mat; }
    
    
    public void setEtat(int e){
        EtatV=Etat[e];
    }
    
   

    public void Afficher() {
    System.out.println( "Marque: "+this.Marque+"\n"+"Matricule: "+this.Matricule
            +"\n"+"Etat: "+EtatV);}
    


    public String toString() {
    
    return "\nMarque: "+this.Marque+" || Matricule: "+this.Matricule +" || Etat: "+EtatV+"\n";
}
}