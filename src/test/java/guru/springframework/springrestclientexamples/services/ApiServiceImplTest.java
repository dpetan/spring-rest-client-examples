package guru.springframework.springrestclientexamples.services;

import static org.junit.Assert.*;

import java.util.List;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    ApiService apiService;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGetUsers() throws Exception {

        List<User> userList = apiService.getUsers(5);
        assertTrue(userList.size() > 0);
    }
}
