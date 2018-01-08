package projet_vacances;



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
        Matricule=mat;
        Marque=mar;
        EtatV= Etat[et];
        
        System.out.println("Vous avez construit une voiture de la marque "+Marque+", matriculé "+ Matricule+" et qui est "+EtatV );
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