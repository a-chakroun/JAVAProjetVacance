
package projet_vacances;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author AhmedAmineChakroun
 */
public class Location {
    private Vehicule V;
    private Client C;
    
    private int MoisDeb; //le mois du debutde location
    private int JourDeb; //le jour du debutde location
    
    private int MoisFin; //le mois de fin de location //0 pour janvier 1 pour fevrier etc
    private int JourFin; //le jour de fin de location
    
    Calendar dateFin;
    Calendar dateDeb ;
    
    
 
    private double Prix=100; // testing with price and Avance
    private double MontAv=50;

    public Location(Vehicule V,Client C){ 
        this.C=C;
       
        this.V=V;
    }
    
    public Vehicule getV() {
        return V;
    }

    public void setV(Vehicule V) {
        this.V = V;
    }

    public Client getC() {
        return C;
    }

    public void setC(Client C) {
        this.C = C;
    }

    public int getMoisDeb() {
        return MoisDeb;
    }
    public int getJourDeb() {
        return JourDeb;
    }
    
    public void setMoisDeb(int MoisDeb) {
        this.MoisDeb = MoisDeb;
    }
    public void setJourDeb(int JourDeb) {
        this.JourDeb = JourDeb;
    }

    public int getMoisFin() {
        return MoisFin;
    }

    public int getJourFin() {
        return JourFin;
    }

    public void setJourFin(int JourFin) {
        this.JourFin = JourFin;
    }

    public void setMoisFin(int MoisFin) {
        this.MoisFin = MoisFin;
    }

    public double getPrix() {
        return Prix;
    }

    public void setPrix(double Prix) {
        this.Prix = Prix;
    }

    public String getDateDeb() { //pour modifier le format de la date, on va repeter le meme proces our la date fin
       String str = String.format("%1$s %2$tB %2$td, %2$tY", "date debut:", dateDeb);
        return str;
}

    public void setDateDeb(int MoisDeb,int JourDeb) { //cette methode est plutot unitile apres avoir declaré le gregorian calndar
    dateDeb = new GregorianCalendar(2018,MoisDeb,JourDeb); //on utilise le GregorianCalendar pour le jour avec les jour et mois qu'on a declaré auparavant
    

    }

    public String getDateFin() {
        String str = String.format("%1$s %2$tB %2$td, %2$tY", "date fin:", dateFin);
        return str;
    }

    public void setDateFin(int MoisFin ,int JourFin) {
        dateFin = new GregorianCalendar(2018,MoisFin,JourFin);
    }

    public double getMontAv() {
        return MontAv;
    }

    public void setMontAv(double MontAv) {
        this.MontAv = MontAv;
    }
    
    
    public void Afficher(){
    System.out.println("Le client "+C.getNom()+" "+C.getPrenom()+
            " a loué la voiture "+V.getMarque()+" avec le matricule "+
            V.getMatricule()+" du "+this.getDateDeb()+
            " jusqu'a "+this.getDateFin()+" et payé en avance "+
            this.MontAv+" pour un prix final de "+this.Prix);
    }
    
    
}
