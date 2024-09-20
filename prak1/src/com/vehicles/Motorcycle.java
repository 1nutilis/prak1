package com.vehicles;

class Motorcycle extends Vehicle {
    private String type;
    private boolean hasBox;

    public Motorcycle(String brand, String model, int year, String type, boolean hasBox) {
        super(brand, model, year);
        this.type = type;
        this.hasBox = hasBox;
    }

    public String getType() {
        return type;
    }

    public boolean hasBox() {
        return hasBox;
    }

    @Override
    public String toString() {
        return super.toString() + ", Тип кузова: " + type + ", Наличие бокса: " + hasBox;
    }
}