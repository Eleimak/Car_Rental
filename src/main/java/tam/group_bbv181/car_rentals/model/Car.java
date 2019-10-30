package tam.group_bbv181.car_rentals.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document
public class Car {
    @Id
    private String id;
    private String brandCar;
    private String modelCar;
    private int costCar;
    private String licenseNumberPlates;
    private TypeCar typeCar;
    private Integer yearCar;
    private int rentalPrice;
    private boolean repair;

    public Car() {
    }

    public Car(String brandCar, String modelCar, int costCar, String licenseNumberPlates, TypeCar typeCar, int yearCar, int rentalPrice, boolean repair) {
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.costCar = costCar;
        this.licenseNumberPlates = licenseNumberPlates;
        this.typeCar = typeCar;
        this.yearCar = yearCar;
        this.rentalPrice = rentalPrice;
        this.repair = repair;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public int getCostCar() {
        return costCar;
    }

    public void setCostCar(int costCar) {
        this.costCar = costCar;
    }

    public String getLicenseNumberPlates() {
        return licenseNumberPlates;
    }

    public void setLicenseNumberPlates(String licenseNumberPlates) {
        this.licenseNumberPlates = licenseNumberPlates;
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }

    public Integer getYearCar() {
        return yearCar;
    }

    public void setYearCar(Integer yearCar) {
        this.yearCar = yearCar;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public boolean isRepair() {
        return repair;
    }

    public void setRepair(boolean repair) {
        this.repair = repair;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return costCar == car.costCar &&
                yearCar == car.yearCar &&
                rentalPrice == car.rentalPrice &&
                repair == car.repair &&
                Objects.equals(id, car.id) &&
                Objects.equals(brandCar, car.brandCar) &&
                Objects.equals(modelCar, car.modelCar) &&
                Objects.equals(licenseNumberPlates, car.licenseNumberPlates) &&
                typeCar == car.typeCar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", brandCar='" + brandCar + '\'' +
                ", modelCar='" + modelCar + '\'' +
                ", costCar=" + costCar +
                ", licenseNumberPlates='" + licenseNumberPlates + '\'' +
                ", typeCar=" + typeCar +
                ", carYear=" + yearCar +
                ", rentalPrice=" + rentalPrice +
                ", repair=" + repair +
                '}';
    }
}
