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
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootApplication
public class DiplomaApplication {

    @PersistenceContext
    private EntityManager em;

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

//    @EventListener(ApplicationReadyEvent.class) //Если метод отмечен такой аннотацией, то он будет выполнятся
//    void testJpa() { //при запуске приложения. Параметр аннотации определяет, что метод testJpa() выполнится
//                     //после полного запуска приложения.
//        Address address = new Address();
//        address.setCountry("Ukraine");
//        address.setCity("Odessa");
//        address.setStreet("Balkovskaya");
//        address.setHome(28);
//        addressService.createAddress(address);
//
//        User user = new User();
//        user.setFirstname("Yuriy");
//        user.setLastname("Koppen");
//        user.setAddress(address);
//        userService.createUser(user);
//
//    }
//    @EventListener(ApplicationReadyEvent.class)
//    void queryTest() {
//        User user1 = userService.findUser(9);
//        System.out.println(user1);
//
//        User user2 = em.createQuery("select u from User u where u.firstname = 'John'", User.class).getSingleResult();
//        System.out.println(user2);
//
//        User user3 = (User) em.createNativeQuery("select * from user where address_id = 20", User.class).getSingleResult();
//        System.out.println(user3);
//    }
}

