public class Parc {
    public static void main(String[] args) {

        Voiture v1=Voiture.creerVoiture(2019,Carburant.diesel);
        Camion c1 = Camion.creerCamion(2014,Carburant.essence);



        v1.addCarburant(20);
        v1.periodiciteVidage();
        System.out.println(v1.toString());

        c1.addCarburant(20);

        



    }
}
