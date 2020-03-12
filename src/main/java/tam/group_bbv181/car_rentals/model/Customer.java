package tam.group_bbv181.car_rentals.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Objects;

@Document
public class Customer {
    @Id
    private String id;
    private Person person;
    private String address;
    private String phone;
    private String eMail;
    private int bonusPoints;
    private List<ReturnRentCar> carList;
    private ReturnRentCar rent;

    public Customer() { }

    public Customer(Person person, String address, String phone, String eMail) {
        this.person = person;
        this.address = address;
        this.phone = phone;
        this.eMail = eMail;
    }

    public Customer(String id, Person person, String address, String phone, String eMail) {
        this.id = id;
        this.person = person;
        this.address = address;
        this.phone = phone;
        this.eMail = eMail;
    }

    public Customer(Person person, String address, String phone, String eMail, List<ReturnRentCar> carList, ReturnRentCar rent) {
        this.person = person;
        this.address = address;
        this.phone = phone;
        this.eMail = eMail;
        this.carList = carList;
        this.rent = rent;
    }

    public Customer(String id, Person person, String address, String phone, String eMail, List<ReturnRentCar> carList, ReturnRentCar rent) {
        this.id = id;
        this.person = person;
        this.address = address;
        this.phone = phone;
        this.eMail = eMail;
        this.carList = carList;
        this.rent = rent;
    }

    public Customer(Person person, String address, String phone, String eMail, int bonusPoints, List<ReturnRentCar> carList, ReturnRentCar rent) {
        this.person = person;
        this.address = address;
        this.phone = phone;
        this.eMail = eMail;
        this.bonusPoints = bonusPoints;
        this.carList = carList;
        this.rent = rent;
    }

    public Customer(String id, Person person, String address, String phone, String eMail, int bonusPoints, List<ReturnRentCar> carList, ReturnRentCar rent) {
        this.id = id;
        this.person = person;
        this.address = address;
        this.phone = phone;
        this.eMail = eMail;
        this.bonusPoints = bonusPoints;
        this.carList = carList;
        this.rent = rent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    public void setBonusPoints(int bonusPoints) {
        this.bonusPoints = bonusPoints;
    }

    public List<ReturnRentCar> getCarList() {
        return carList;
    }

    public void setCarList(List<ReturnRentCar> carList) {
        this.carList = carList;
    }

    public ReturnRentCar getRent() {
        return rent;
    }

    public void setRent(ReturnRentCar rent) {
        this.rent = rent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id.equals(customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", person=" + person +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", eMail='" + eMail + '\'' +
                ", bonusPoints=" + bonusPoints +
                ", carList=" + carList +
                ", rent=" + rent +
                '}';
    }
}
