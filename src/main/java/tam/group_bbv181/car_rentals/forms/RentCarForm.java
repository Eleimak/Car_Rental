package tam.group_bbv181.car_rentals.forms;

import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.model.Customer;

import java.time.LocalDate;
import java.util.Objects;

public class RentCarForm {
    private String id;
    private Car car;
    private String carID;
    private String carBrand;
    private String carModel;
    private String carNumber;
    private int carRentalPrice;
    private Customer customer;
    private String customerID;
    private String customerFirstName;
    private String customerLastName;
    private String customerMiddleName;
    private String dateOfIssue;
    private String returnDate;
    private double returnCost;
    private double repairCost;

    public RentCarForm() {
    }

    public RentCarForm(String id, Car car, String carID, String carBrand,
                       String carModel, String carNumber, int carRentalPrice,
                       Customer customer, String customerID,
                       String customerFirstName, String customerLastName,
                       String customerMiddleName, String dateOfIssue,
                       String returnDate, double returnCost, double repairCost) {
        this.id = id;
        this.car = car;
        this.carID = carID;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.carNumber = carNumber;
        this.carRentalPrice = carRentalPrice;
        this.customer = customer;
        this.customerID = customerID;
        this.customerFirstName = customerFirstName;
        this.customerLastName = customerLastName;
        this.customerMiddleName = customerMiddleName;
        this.dateOfIssue = dateOfIssue;
        this.returnDate = returnDate;
        this.returnCost = returnCost;
        this.repairCost = repairCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getCarRentalPrice() {
        return carRentalPrice;
    }

    public void setCarRentalPrice(int carRentalPrice) {
        this.carRentalPrice = carRentalPrice;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public String getCustomerMiddleName() {
        return customerMiddleName;
    }

    public void setCustomerMiddleName(String customerMiddleName) {
        this.customerMiddleName = customerMiddleName;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public double getReturnCost() {
        return returnCost;
    }

    public void setReturnCost(double returnCost) {
        this.returnCost = returnCost;
    }

    public double getRepairCost() {
        return repairCost;
    }

    public void setRepairCost(double repairCost) {
        this.repairCost = repairCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentCarForm that = (RentCarForm) o;
        return carRentalPrice == that.carRentalPrice &&
                Double.compare(that.returnCost, returnCost) == 0 &&
                Double.compare(that.repairCost, repairCost) == 0 &&
                Objects.equals(id, that.id) &&
                Objects.equals(car, that.car) &&
                Objects.equals(carID, that.carID) &&
                Objects.equals(carBrand, that.carBrand) &&
                Objects.equals(carModel, that.carModel) &&
                Objects.equals(carNumber, that.carNumber) &&
                Objects.equals(customer, that.customer) &&
                Objects.equals(customerID, that.customerID) &&
                Objects.equals(customerFirstName, that.customerFirstName) &&
                Objects.equals(customerLastName, that.customerLastName) &&
                Objects.equals(customerMiddleName, that.customerMiddleName) &&
                Objects.equals(dateOfIssue, that.dateOfIssue) &&
                Objects.equals(returnDate, that.returnDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "RentCarForm{" +
                "id='" + id + '\'' +
                ", car=" + car +
                ", carID='" + carID + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", carNumber='" + carNumber + '\'' +
                ", carRentalPrice=" + carRentalPrice +
                ", customer=" + customer +
                ", customerID='" + customerID + '\'' +
                ", customerFirstName='" + customerFirstName + '\'' +
                ", customerLastName='" + customerLastName + '\'' +
                ", customerMiddleName='" + customerMiddleName + '\'' +
                ", dateOfIssue='" + dateOfIssue + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", returnCost=" + returnCost +
                ", repairCost=" + repairCost +
                '}';
    }
}
