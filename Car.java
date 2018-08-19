package lesson12;

import java.util.Objects;

public abstract class Car {

    private String company;
    private String model;
    private Integer year;
    private String colour;

    public Car(String company, String model, Integer year, String colour) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(company, car.company) &&
                Objects.equals(model, car.model) &&
                Objects.equals(year, car.year) &&
                Objects.equals(colour, car.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company, model, year, colour);
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }
}