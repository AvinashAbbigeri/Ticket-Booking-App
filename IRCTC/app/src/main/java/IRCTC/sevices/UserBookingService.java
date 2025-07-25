package IRCTC.sevices;

import IRCTC.entities.User;
import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.List;
import java.io.IOException;

public class UserBookingService {
    private User user;

    private List<User> userList;

    private ObjectMapper objectMapper = new ObjectMapper();

    private static final String USERS_PATH = "../localDB/users.json";


    public UserBookingService(User user) throws IOException {
        this.user = user;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {});
    }
}
