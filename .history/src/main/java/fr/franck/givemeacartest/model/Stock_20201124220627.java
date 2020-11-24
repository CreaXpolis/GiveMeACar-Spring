package fr.franck.givemeacartest.model;

import java.util.ArrayList;

public class Stock {

   public Vehicules[] arrayVehicules;

    public Stock() {

        // Création de nouveau véhicules fictifs
        ArrayList<Vehicules> listeDeVehicule = new ArrayList<Vehicules>();

        Vehicules vehicule1 = new Vehicules("1008", "Peugeot", "Voiture", "HJYT 678 44", "18.3 -96.9", 0.5, 50,
                "disponibilite");
                listeDeVehicule.add(vehicule1);
        Vehicules vehicule2 = new Vehicules("Picasso", "Citroen", "Voiture", "HG 8789 44", "-84.7 101.1", 0.1, 80,
                "disponibilite");
                listeDeVehicule.add(vehicule2);
        Vehicules vehicule3 = new Vehicules("Getz", "Hyundai", "Voiture", "KL 999 44", "-8.2 177.6", 0.25, 95,
                "disponibilite");
                listeDeVehicule.add(vehicule3);
        Vehicules vehicule4 = new Vehicules("Aware", "Jeep", "Voiture", "JK 432 44", "-19.2 66.2", 0.01, 100,
                "disponibilite");
                listeDeVehicule.add(vehicule4);
        Vehicules vehicule5 = new Vehicules("Focus", "Ford", "Voiture", "WIOK 78 44", "-16.3 -48.6", 0.04, 45,
                "disponibilite");
                listeDeVehicule.add(vehicule5);
        Vehicules vehicule6 = new Vehicules("Civic", "Honda", "Voiture", "JDSGH 898 44", "42.7 -4.8", 0.048, 12,
                "disponibilite");
                listeDeVehicule.add(vehicule6);
        Vehicules vehicule7 = new Vehicules("Adventura", "Lancia", "Voiture", "KDSD 878 44", "11.2 7.7", 0.22, 36,
                "disponibilite");
                listeDeVehicule.add(vehicule7);
        Vehicules vehicule8 = new Vehicules("Twingo", "Renault", "Voiture", "9084347 JJJ 44", "-7.8 53.9", 0.33, 44,
                "disponibilite");
                listeDeVehicule.add(vehicule8);
        Vehicules vehicule9 = new Vehicules("Jigatsu", "Kia", "Voiture", "DER ONIO 44", "4.3 -108.7", 0.47, 77,
                "disponibilite");
                listeDeVehicule.add(vehicule9);
        Vehicules vehicule10 = new Vehicules("Serie 1", "BMW", "Voiture", "VAKFDF 7876 44", "-20.2 -137.6", 0.48, 88,
                "disponibilite");
                listeDeVehicule.add(vehicule10);
        Vehicules vehicule11 = new Vehicules("Space Wagon", "Mitsubishi", "Voiture", "DDKQSLDK 44", "-53.2 -169.7",
                0.001, 10, "disponibilite");
                listeDeVehicule.add(vehicule11);
        Vehicules vehicule12 = new Vehicules("Clio", "Renault", "Voiture", "DSFJ 7897 44", "-36.2 15.7", 0.01, 2,
                "disponibilite");
                listeDeVehicule.add(vehicule12);
        Vehicules vehicule13 = new Vehicules("", "marques", "Voiture", "DSLDKLK 888 44", "-67.4 -142.4", 0.02, 5,
                "disponibilite");
                listeDeVehicule.add(vehicule13);
        Vehicules vehicule14 = new Vehicules("Voiture", "marques", "Voiture", "54343 FHDFH2 44", "-8.5 173.8", 0.22, 8,
                "disponibilite");
                listeDeVehicule.add(vehicule14);
        Vehicules vehicule15 = new Vehicules("Voiture", "marques", "Voiture", "KKKK SDQSKDK 44", "-66.8 90.1", 0.33, 10,
                "disponibilite");
                listeDeVehicule.add(vehicule15);

               
                //this.arrayVehicules = new Vehicules[14];
                //this.arrayVehicules[0]= vehicule11;

 

    Object[] array = listeDeVehicule.toArray();
    this.arrayVehicules = new Vehicules[array.length];

    for(inti=0 ; i<array.length ; i++){
            arrayVehicules[i]= (Vehicules) array[i];
    }

 

}
}
