package tam.group_bbv181.car_rentals.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.util.Objects;

@Document
public class Car {
    @Id
    private String id;
    private String brandCar;
    private int costCar;
    private String licenseNumberPlates;
    private String carCondition;
    private TypeCar typeCar;
    private LocalDate carYear;
    private int rentalPrice;
    private boolean repair;

    public Car() {
    }

    public Car(String brandCar, int costCar, String licenseNumberPlates,
               String carCondition, TypeCar typeCar, LocalDate carYear, int rentalPrice) {
        this.brandCar = brandCar;
        this.costCar = costCar;
        this.licenseNumberPlates = licenseNumberPlates;
        this.carCondition = carCondition;
        this.typeCar = typeCar;
        this.carYear = carYear;
        this.rentalPrice = rentalPrice;
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

    public String getCarCondition() {
        return carCondition;
    }

    public void setCarCondition(String carCondition) {
        this.carCondition = carCondition;
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }

    public LocalDate getCarYear() {
        return carYear;
    }

    public void setCarYear(LocalDate carYear) {
        this.carYear = carYear;
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
                rentalPrice == car.rentalPrice &&
                repair == car.repair &&
                Objects.equals(id, car.id) &&
                Objects.equals(brandCar, car.brandCar) &&
                Objects.equals(licenseNumberPlates, car.licenseNumberPlates) &&
                Objects.equals(carCondition, car.carCondition) &&
                typeCar == car.typeCar &&
                Objects.equals(carYear, car.carYear);
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
                ", costCar=" + costCar +
                ", licenseNumberPlates='" + licenseNumberPlates + '\'' +
                ", carCondition='" + carCondition + '\'' +
                ", typeCar=" + typeCar +
                ", carYear=" + carYear +
                ", rentalPrice=" + rentalPrice +
                ", repair=" + repair +
                '}';
    }
}
