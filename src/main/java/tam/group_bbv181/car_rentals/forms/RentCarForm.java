package tam.group_bbv181.car_rentals.forms;

import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.model.Customer;

import java.time.LocalDate;
import java.util.Objects;

public class RentCarForm {
    private String id;
    private Car car;
    private Customer customer;
    private LocalDate dateOfIssue;
    private LocalDate returnDate;

    public RentCarForm() {
    }

    public RentCarForm(String id, Car car, Customer customer, LocalDate dateOfIssue, LocalDate returnDate) {
        this.id = id;
        this.car = car;
        this.customer = customer;
        this.dateOfIssue = dateOfIssue;
        this.returnDate = returnDate;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(LocalDate dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RentCarForm that = (RentCarForm) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(car, that.car) &&
                Objects.equals(customer, that.customer) &&
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
                ", customer=" + customer +
                ", dateOfIssue=" + dateOfIssue +
                ", returnDate=" + returnDate +
                '}';
    }
}
