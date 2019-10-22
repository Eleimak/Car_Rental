package tam.group_bbv181.car_rentals.forms;

public class CustomerForm {
    private String id;
    private String login;
    private String password;
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String address;
    private int phone;
    private String eMail;
    private int bonusPoints;

    public CustomerForm() {
    }

    public CustomerForm(String id, String firstName, String middleName, String lastName, String gender, String address, int phone, String eMail, int bonusPoints) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
        this.eMail = eMail;
        this.bonusPoints = bonusPoints;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gander) {
        this.gender = gander;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
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

    @Override
    public String toString() {
        return "CustomerForm{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gander='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone +
                ", eMail='" + eMail + '\'' +
                ", bonusPoints=" + bonusPoints +
                '}';
    }
}
