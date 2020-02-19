package tests;

import org.junit.jupiter.api.Test;
import service.UserService;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void addUser() {
        UserService service = new UserService();

        service.addUser("Kamil", "Sikorakamil26@gmail.com", "qwer");
    }
}