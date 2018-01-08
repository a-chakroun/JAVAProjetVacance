/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_vacances;

/**
 *
 * @author ExNihilo
 */
public class Location {
    private Vehicule V;
    private Client C;
    
    private int MoisDeb;
    private int JourDeb;
    
    private int MoisFin;
    private int JourFin;
    
    private double Prix=100; // testing with price and Avence
    private double MontAv=50;

    public Location(Vehicule V,Client C, double Avance){
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

    public void setMoisDeb(int MoisDeb) {
        this.MoisDeb = MoisDeb;
    }

    public int getJourDeb() {
        return JourDeb;
    }

    public void setJourDeb(int JourDeb) {
        this.JourDeb = JourDeb;
    }

    public int getMoisFin() {
        return MoisFin;
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

    public double getMontAv() {
        return MontAv;
    }

    public void setMontAv(double MontAv) {
        this.MontAv = MontAv;
    }
    
    
    public void Afficher(){
    System.out.println("Le client "+C.getNom()+" "+C.getPrenom()+
            " a loué la voiture "+V.getMarque()+" avec le matricule "+
            V.getMatricule()+" du "+this.JourDeb+"/"+this.MoisDeb+
            " au "+this.JourFin+"/"+this.MoisFin+" et payé en avance "+
            this.MontAv+" pour un prix final de "+this.Prix);
    }
    
    
}
