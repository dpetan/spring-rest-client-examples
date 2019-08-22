package guru.springframework.springrestclientexamples.services;

import java.util.List;

import guru.springframework.api.domain.User;
import guru.springframework.api.domain.UserData;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ApiServiceImpl implements ApiService {

    private final RestTemplate restTemplate;

    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {

        UserData userData = restTemplate.getForObject("http://private-anon-a4e9684223-apifaketory.apiary-mock.com/api/user?limit=" + limit, UserData.class);
        return userData.getData();
    }
}
