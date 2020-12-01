package com.step.diploma;

import com.step.diploma.entities.Address;
import com.step.diploma.entities.User;
import com.step.diploma.services.AddressService;
import com.step.diploma.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;


@SpringBootApplication
public class DiplomaApplication {

    private UserService userService;
    private AddressService addressService;

    @Autowired
    public DiplomaApplication(UserService userService, AddressService addressService) {
        this.userService = userService;
        this.addressService = addressService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DiplomaApplication.class, args);
    }


    @EventListener(ApplicationReadyEvent.class)
    private void testJpaMethods() {
        Address address = new Address();
        address.setCountry("Ukraine");
        address.setCity("Odessa");
        address.setStreet("Balkovskaya");
        address.setHome(28);
        addressService.createAddress(address);

        User user = new User();
        user.setFirstname("Yuriy");
        user.setLastname("Koppen");
        user.setAddress_id(1);
        userService.createUser(user);
    }
}

