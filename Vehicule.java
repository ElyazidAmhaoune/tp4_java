abstract class Vehicule implements Motorisation {
    private String matricule;
    private int model;
    private double prix; 
    private double carburant; 

    public Vehicule(int model){
        model=model;

    }
    public void setCarburant(double carburant){
        this.carburant=carburant;


    }
    public double getCarburant(){
        return this.carburant;
    }
    public void setMatricule(String matricule){
        this.matricule=matricule;

    }
    public String getMatricule(){
        return this.matricule;
    }
    public void setModel(int model){
        this.model=model;
    }
    public int getmodel(){
        return this.model;

    }
    public void setPrix(double prix){
        this.prix=prix;
    }
    public double getPrix(){
        return this.prix;
    }
    public String ToString(){
        return "matricule "+this.matricule+"Model "+this.model;
    }

}
