package tam.group_bbv181.car_rentals.forms;

import tam.group_bbv181.car_rentals.model.TypeCar;

import java.util.Objects;

public class CarListSearchForm {
    private String carYear;
    private TypeCar typeCar;
    private String repairCar;

    public CarListSearchForm() {
    }

    public CarListSearchForm(String carYear, TypeCar typeCar, String repairCar) {
        this.carYear = carYear;
        this.typeCar = typeCar;
        this.repairCar = repairCar;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }

    public String getRepairCar() {
        return repairCar;
    }

    public void setRepairCar(String repairCar) {
        this.repairCar = repairCar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarListSearchForm that = (CarListSearchForm) o;
        return Objects.equals(carYear, that.carYear) &&
                typeCar == that.typeCar &&
                Objects.equals(repairCar, that.repairCar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carYear);
    }

    @Override
    public String toString() {
        return "CarListSearchForm{" +
                "carYear='" + carYear + '\'' +
                ", typeCar=" + typeCar +
                ", repairCar='" + repairCar + '\'' +
                '}';
    }
}
