package lesson12;

import java.util.HashMap;

public class Garage {

    private HashMap<Car, Integer> garage = new HashMap<>();

    public void parkToGarage(Car car) {
        if (!garage.containsKey(car)) {
            garage.put(car, 1);
        } else {
            garage.put(car, garage.get(car) + 1);
        }
    }

    public void printGarageStats() {
        System.out.println(garage);
    }

    public void exitGarage(Car car) {
        if (!garage.containsKey(car)) {
            System.out.println("There is no such car in the garage.");
        } else if (garage.get(car).equals(1)) {
            garage.remove(car);
        } else {
            garage.put(car, garage.get(car) - 1);
        }
    }

    public void countSimilarCars(Car car) {
        if (!garage.containsKey(car)) {
            System.out.println("There are no cars of this type in the garage.");
        } else {
            System.out.println("As for now there are " + garage.get(car) + " cars of this type in the garage.");
        }
    }
}