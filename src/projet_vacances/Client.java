
package projet_vacances;

/**
 *
 * @author AhmedAmine
 */
public class Client {
    private int CIN; 
    private String nom;
    private String prenom;
    private String adresse;
    
    public Client(int CIN, String nom, String prenom, String adresse){
        this.CIN=CIN;
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;   
    }

    public int getCIN() {
        return CIN;
    }

    public void setCIN(int CIN) {
        this.CIN = CIN;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    
    public String toString() {
        return "Client " + "CIN=" + CIN + ", nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + '}';
    }
    
}
