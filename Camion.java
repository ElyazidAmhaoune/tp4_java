public class Camion extends Vehicule {
    private static int nbVCamions = 0;
     private static int nbMaxCamion = 100;
    private Carburant carburant;
    private static int capacite=50;
    private int periodiciteVidange;

    public Camion(int model,Carburant carburant ) {
        super(model);
        this.carburant = carburant;
        this.setMatricule(this.getClass().getName()+":"+ ++nbVCamions);s
        
    }
    public static Camion creerCamion(int modele, Carburant carburant) {
        if (nbVCamions < nbMaxCamion){ 
        return new Camion(modele,carburant);
        }
        else{
         System.out.println("parc full");
        return null;
        }
    }
    public void addCarburant(double carburant) {
        if( (getCarburant()+carburant)<= capacite){
            setCarburant(getCarburant()+carburant);
        } else{
            double max_carburant_ajout = capacite - getCarburant();
            this.setCarburant(capacite);
        }

        
    }
   
    @Override
    public Carburant typeCarburant() {
        
        return carburant;
    }
    @Override
    public void periodiciteVidage() {
        switch (carburant) {
            case diesel: periodiciteVidange=10;
                
                break;
            case essence: periodiciteVidange=12;
                
                break;
            case gaz: periodiciteVidange=18;
                
                break;
        
            default: periodiciteVidange=19;
                break;
        }
      
        
    }
    
}