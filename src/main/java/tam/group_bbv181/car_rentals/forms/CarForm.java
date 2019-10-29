package tam.group_bbv181.car_rentals.forms;

import tam.group_bbv181.car_rentals.model.TypeCar;

import java.util.Objects;

public class CarForm {
    private String id;
    private String brandCar;
    private String modelCar;
    private int costCar;
    private String licenseNumberPlates;
    private TypeCar typeCar;
    private int carYear;
    private int rentalPrice;
    private boolean repair;

    public CarForm() {
    }

    public CarForm(String id, String brandCar, String modelCar, int costCar, String licenseNumberPlates, TypeCar typeCar, int carYear, int rentalPrice, boolean repair) {
        this.id = id;
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.costCar = costCar;
        this.licenseNumberPlates = licenseNumberPlates;
        this.typeCar = typeCar;
        this.carYear = carYear;
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

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
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
        CarForm carForm = (CarForm) o;
        return costCar == carForm.costCar &&
                carYear == carForm.carYear &&
                rentalPrice == carForm.rentalPrice &&
                repair == carForm.repair &&
                Objects.equals(id, carForm.id) &&
                Objects.equals(brandCar, carForm.brandCar) &&
                Objects.equals(modelCar, carForm.modelCar) &&
                Objects.equals(licenseNumberPlates, carForm.licenseNumberPlates) &&
                typeCar == carForm.typeCar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "CarForm{" +
                "id='" + id + '\'' +
                ", brandCar='" + brandCar + '\'' +
                ", modelCar='" + modelCar + '\'' +
                ", costCar=" + costCar +
                ", licenseNumberPlates='" + licenseNumberPlates + '\'' +
                ", typeCar=" + typeCar +
                ", carYear=" + carYear +
                ", rentalPrice=" + rentalPrice +
                ", repair=" + repair +
                '}';
    }
}
