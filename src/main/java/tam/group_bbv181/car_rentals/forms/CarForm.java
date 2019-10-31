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
    private Integer yearCar;
    private int rentalPrice;
    private String repair;
    private String rent;

    public CarForm() {
    }

    public CarForm(String id, String brandCar, String modelCar, int costCar, String licenseNumberPlates, TypeCar typeCar, Integer yearCar, int rentalPrice, String repair, String rent) {
        this.id = id;
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.costCar = costCar;
        this.licenseNumberPlates = licenseNumberPlates;
        this.typeCar = typeCar;
        this.yearCar = yearCar;
        this.rentalPrice = rentalPrice;
        this.repair = repair;
        this.rent = rent;
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

    public String getRepair() {
        return repair;
    }

    public void setRepair(String repair) {
        this.repair = repair;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarForm carForm = (CarForm) o;
        return costCar == carForm.costCar &&
                rentalPrice == carForm.rentalPrice &&
                Objects.equals(id, carForm.id) &&
                Objects.equals(brandCar, carForm.brandCar) &&
                Objects.equals(modelCar, carForm.modelCar) &&
                Objects.equals(licenseNumberPlates, carForm.licenseNumberPlates) &&
                typeCar == carForm.typeCar &&
                Objects.equals(yearCar, carForm.yearCar) &&
                Objects.equals(repair, carForm.repair) &&
                Objects.equals(rent, carForm.rent);
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
                ", yearCar=" + yearCar +
                ", rentalPrice=" + rentalPrice +
                ", repair='" + repair + '\'' +
                ", rent='" + rent + '\'' +
                '}';
    }
}
