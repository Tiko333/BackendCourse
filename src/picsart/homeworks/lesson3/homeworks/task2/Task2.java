package picsart.homeworks.lesson3.homeworks.task2;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {

        // Create Logical Structures (As big as possible) from your life and print them in main function.
        User user = new User();
        Set<String> roles = new HashSet<>();
        Address address = new Address();

        roles.add("ADMIN");
        address.setCountry("Armenia");
        address.setCity("Yerevan");
        address.setStreet("Estonakan");
        address.setStateProvince("Yerevan");
        address.setPostalCode("0038");

        user.setId(1);
        user.setFirstName("Tigran");
        user.setLastName("Galstyan");
        user.setEmail("abc@gmail.com");
        user.setPassword("somePassword");
        user.setPhoneNumber("+37400000000");
        user.setAddress(address);
        user.setBirthday(new Date());
        user.setCreationDate(new Date());
        user.setLastAccess(new Date());
        user.setActive(true);
        user.setRoles(roles);

        System.out.println(user);

    }
}
