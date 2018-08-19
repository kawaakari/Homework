package lesson12;

public class Task1Demo {

    public static void main(String[] args) {

        Car audi = new Audi("Audi", "whatever", 2014, "white");
        Car bmw = new Bmw("BMW", "no idea", 2014, "black");
        Car tesla = new Tesla("Tesla", "model S", 2017, "white");
        Car tesla2 = new Tesla("Tesla", "model S", 2018, "white");
        Car tesla3 = new Tesla("Tesla", "model S", 2018, "white");

        Garage garage = new Garage();

        garage.parkToGarage(tesla);
        garage.parkToGarage(audi);
        garage.parkToGarage(bmw);
        garage.parkToGarage(tesla2);
        garage.parkToGarage(tesla3);

        garage.countSimilarCars(tesla2);
        garage.exitGarage(audi);
        garage.exitGarage(tesla3);

        Garage garage2 = new Garage();
        garage2.parkToGarage(tesla3);
        garage2.exitGarage(tesla3);
        garage.exitGarage(audi);
        garage2.printGarageStats();
    }
}
