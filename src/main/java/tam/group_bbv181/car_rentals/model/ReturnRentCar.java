package tam.group_bbv181.car_rentals.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class ReturnRentCar {
    @Id
    private String id;
    private RentCar rentCar;
    private double returnCost;
    private double allCost;

    public ReturnRentCar() {
    }

    public ReturnRentCar(RentCar rentCar, double returnCost, double allCost) {
        this.rentCar = rentCar;
        this.returnCost = returnCost;
        this.allCost = allCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RentCar getRentCar() {
        return rentCar;
    }

    public void setRentCar(RentCar rentCar) {
        this.rentCar = rentCar;
    }

    public double getReturnCost() {
        return returnCost;
    }

    public void setReturnCost(int returnCost) {
        this.returnCost = returnCost;
    }

    public double getAllCost() {
        return allCost;
    }

    public void setAllCost(int allCost) {
        this.allCost = allCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReturnRentCar that = (ReturnRentCar) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ReturnRentCar{" +
                "id='" + id + '\'' +
                ", rentCar=" + rentCar +
                ", returnCost=" + returnCost +
                ", allCost=" + allCost +
                '}';
    }
}
