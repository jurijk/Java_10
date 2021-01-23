package com.step.diploma;

import com.step.diploma.entities.User;
import com.step.diploma.services.AddressService;
import com.step.diploma.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@SpringBootTest
class DiplomaApplicationTests {

    @PersistenceContext
    private EntityManager em;

    private final UserService userService;
    private final AddressService addressService;

    @Autowired
    public DiplomaApplicationTests(UserService userService, AddressService addressService) {
        this.userService = userService;
        this.addressService = addressService;
    }

    @Test
    void queryTest() {
        //User user = new User();
        System.out.println("____________________________________________________________________________________________");
        User user1 = userService.findUser(9);
        System.out.println(user1);
        System.out.println("____________________________________________________________________________________________");
        User user2 = em.createQuery("select u from User u where u.firstname = 'Alla'", User.class).getSingleResult();
        System.out.println(user2);
        System.out.println("____________________________________________________________________________________________");
        User user3 = (User) em.createNativeQuery("select * from user where address_id = 14", User.class).getSingleResult();
        System.out.println(user3);
        System.out.println("____________________________________________________________________________________________");
    }

}
