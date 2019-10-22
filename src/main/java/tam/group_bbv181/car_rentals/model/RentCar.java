package tam.group_bbv181.car_rentals.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document
public class RentCar {
    @Id
    private String id;
    private Car car;
    private Customer customer;
    private boolean accessibility;
    private LocalDate dateOfIssue;
    private LocalDate returnDate;


    public RentCar() {
    }

    public RentCar(Car car, Customer customer, boolean accessibility, LocalDate dateOfIssue, LocalDate returnDate) {
        this.car = car;
        this.customer = customer;
        this.accessibility = accessibility;
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

    public boolean isAccessibility() {
        return accessibility;
    }

    public void setAccessibility(boolean accessibility) {
        this.accessibility = accessibility;
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
    public String toString() {
        return "RentCar{" +
                "id='" + id + '\'' +
                ", car=" + car +
                ", customer=" + customer +
                ", accessibility=" + accessibility +
                ", dateOfIssue=" + dateOfIssue +
                ", returnDate=" + returnDate +
                '}';
    }
}
