import java.io.Serializable; 
public class Voiture extends Vehicule implements Decapotable{
    private static int capacite=50;
    private static int nbVoitures = 0;
    private static int nbMax = 100;
    private Carburant carburant;
    private boolean toitReplie;
    private int periodiciteVidange;

    public Voiture(int model,Carburant carburant) {
        super(model);
        this.setMatricule(this.getClass().getName()+":"+ ++nbVoitures);

        this.carburant = carburant;
    }
    public static Voiture creerVoiture(int modele, Carburant carburant) {
        if (nbVoitures < nbMax){ 
        return new Voiture(modele,carburant);
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

    

    @Override
    public void replieLeToit() {
        toitReplie=true;
    }
    








































































































































































}
