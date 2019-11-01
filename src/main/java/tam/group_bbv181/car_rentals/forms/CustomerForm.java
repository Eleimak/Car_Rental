package tam.group_bbv181.car_rentals.forms;

import tam.group_bbv181.car_rentals.model.Car;
import tam.group_bbv181.car_rentals.model.LoginUser;
import tam.group_bbv181.car_rentals.model.Person;

import java.util.List;
import java.util.Objects;

public class CustomerForm {
    private String id;
    private LoginUser loginUser;
    private String idLogin;
    private String login;
    private String password;
    private Person person;
    private String idPerson;
    private String firstName;
    private String lastName;
    private String middleName;
    private String gender;
    private String address;
    private String phone;
    private String eMail;
    private int bonusPoints;
    private List<Car> carList;
    private boolean rent;

    public CustomerForm() {
    }

    public CustomerForm(String id, LoginUser loginUser, String idLogin,
                        String login, String password, Person person,
                        String idPerson, String firstName, String lastName,
                        String middleName, String gender, String address,
                        String phone, String eMail, int bonusPoints,
                        List<Car> carList, boolean rent) {
        this.id = id;
        this.loginUser = loginUser;
        this.idLogin = idLogin;
        this.login = login;
        this.password = password;
        this.person = person;
        this.idPerson = idPerson;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
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

    public LoginUser getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(LoginUser loginUser) {
        this.loginUser = loginUser;
    }

    public String getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(String idLogin) {
        this.idLogin = idLogin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }

    public boolean isRent() {
        return rent;
    }

    public void setRent(boolean rent) {
        this.rent = rent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerForm that = (CustomerForm) o;
        return bonusPoints == that.bonusPoints &&
                rent == that.rent &&
                Objects.equals(id, that.id) &&
                Objects.equals(loginUser, that.loginUser) &&
                Objects.equals(idLogin, that.idLogin) &&
                Objects.equals(login, that.login) &&
                Objects.equals(password, that.password) &&
                Objects.equals(person, that.person) &&
                Objects.equals(idPerson, that.idPerson) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(middleName, that.middleName) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(address, that.address) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(eMail, that.eMail) &&
                Objects.equals(carList, that.carList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "CustomerForm{" +
                "id='" + id + '\'' +
                ", loginUser=" + loginUser +
                ", idLogin='" + idLogin + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", person=" + person +
                ", idPerson='" + idPerson + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", eMail='" + eMail + '\'' +
                ", bonusPoints=" + bonusPoints +
                ", carList=" + carList +
                ", rent=" + rent +
                '}';
    }
}