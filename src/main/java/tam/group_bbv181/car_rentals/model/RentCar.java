package tam.group_bbv181.car_rentals.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.util.Objects;

@Document
public class RentCar {
    @Id
    private String id;
    private Car car;
    private Customer customer;
    private LocalDate dateOfIssue;
    private LocalDate returnDate;


    public RentCar() {
    }

    public RentCar(Car car, Customer customer, LocalDate dateOfIssue, LocalDate returnDate) {
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
        RentCar rentCar = (RentCar) o;
        return Objects.equals(id, rentCar.id) &&
                Objects.equals(car, rentCar.car) &&
                Objects.equals(customer, rentCar.customer) &&
                Objects.equals(dateOfIssue, rentCar.dateOfIssue) &&
                Objects.equals(returnDate, rentCar.returnDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "RentCar{" +
                "id='" + id + '\'' +
                ", car=" + car +
                ", customer=" + customer +
                ", dateOfIssue=" + dateOfIssue +
                ", returnDate=" + returnDate +
                '}';
    }
}
