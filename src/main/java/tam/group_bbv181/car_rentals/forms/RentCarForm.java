package tam.group_bbv181.car_rentals.forms;

import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.model.Customer;

import java.time.LocalDate;

public class RentCarForm {
    private String id;
    private Car car;
    private Customer customer;
    private boolean accessibility;
    private LocalDate dateOfIssue;
    private LocalDate returnDate;
}
