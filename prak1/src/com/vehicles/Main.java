package com.vehicles;

public class Main {
    public static void main(String[] args) {
        // Создание Т/С
        Car car1 = new Car("Mitsubishi", "Lancer", 2007, 4, "AT");
        Car car2 = new Car("Honda", "Civic", 1991, 2, "MT");
        Motorcycle motorcycle1 = new Motorcycle("Harley-Davidson", "V-Rod", 2007, "Круизер", false);

        // Создание гаражей
        Garage garage1 = new Garage();
        Garage garage2 = new Garage();

        // Добавление Т/С в гаражи
        garage1.addVehicle(car1);
        garage1.addVehicle(motorcycle1);
        garage2.addVehicle(car2);

        // Создание автопарка
        Fleet fleet = new Fleet();

        // Добавление гаражей в автопарк
        fleet.addGarage(garage1);
        fleet.addGarage(garage2);



        // Поиск Т/C в автопарке
        Vehicle foundVehicle = fleet.findVehicle("Honda", "Civic");
        if (foundVehicle != null) {
            System.out.println("Найдено: " + foundVehicle);
        } else {
            System.out.println("Т/C не найдено");
        }

        // Запуск и остановка двигателя транспортных средств
        car1.startEngine();
        car1.stopEngine();
        motorcycle1.startEngine();
        motorcycle1.stopEngine();

        // Удаление Т/С и гаража
        garage1.removeVehicle(motorcycle1);
        fleet.removeGarage(garage2);
    }
}
