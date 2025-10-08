package web.model;

import java.util.Objects;

public class Car {
    private String color;
    private String model;
    private String brand;

    public Car(){}

    public Car (String color, String model, String brand){
        this.brand = brand;
        this.color = color;
        this.model = model;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) && Objects.equals(model, car.model) && Objects.equals(brand, car.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, model, brand);
    }
}
