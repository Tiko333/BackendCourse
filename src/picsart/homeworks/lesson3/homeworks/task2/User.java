package picsart.homeworks.lesson3.homeworks.task2;

import java.util.Date;
import java.util.Set;

public class User {

    private long id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String phoneNumber;

    private Address address;

    private Date birthday;

    private Date creationDate;

    private Date lastAccess;

    private boolean active;

    private Set<String> roles;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() < 6) {
            System.err.println("Password length must be at least 6");
        }
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(Date lastAccess) {
        this.lastAccess = lastAccess;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "id : " + id + " " +
                "\nFull name: " + firstName + " " + lastName + " " +
                "\nemail: " + email + " " + " " +
                "\nPassword: " + password.substring(0, 1) + "*********" + " " +
                "\nPhone number: " + phoneNumber + " " +
                "\nAddress:  \n\tCountry: " + address.getCountry() + " \n\tCity: " + address.getCity() + " \n\tStreet: " + address.getStreet() + " \n\tProvince: " + address.getStateProvince() + " \n\tPostal code: " + address.getPostalCode() + " " +
                "\nBirthday: " + birthday + " " +
                "\nCreation date: " + creationDate + " " +
                "\nLast access: " + lastAccess + " " +
                "\nRoles: " + roles;
    }



}
