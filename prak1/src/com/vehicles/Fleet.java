package com.vehicles;

import java.util.ArrayList;
import java.util.List;

class Fleet {
    private List<Garage> garages;

    public Fleet() {
        this.garages = new ArrayList<>();
    }

    public void addGarage(Garage garage) {
        garages.add(garage);
        System.out.println("Гараж добавлен в автопарк");
    }

    public void removeGarage(Garage garage) {
        garages.remove(garage);
        System.out.println("Гараж убран из автопарка");
    }

    public Vehicle findVehicle(String brand, String model) {
        for (Garage garage : garages) {
            for (Vehicle vehicle : garage.getVehicles()) {
                if (vehicle.getBrand().equalsIgnoreCase(brand) && vehicle.getModel().equalsIgnoreCase(model)) {
                    return vehicle;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Автопарк: " + garages;
    }
}
