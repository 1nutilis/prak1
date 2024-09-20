package com.vehicles;

import java.util.ArrayList;
import java.util.List;


class Garage {
    private List<Vehicle> vehicles;

    public Garage() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Т/C " + vehicle + " добавлено в гараж");
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
        System.out.println("Т/C " + vehicle + " убрано из гаража");
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    @Override
    public String toString() {
        return "Гараж: " + vehicles;
    }
}
