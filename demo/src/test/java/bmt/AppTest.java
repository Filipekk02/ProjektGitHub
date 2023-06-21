import com.example.model.User;
import com.example.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Test class for {@link UserService}.
 */
public class ModelServiceTest {

    private UserService userService;

    /**
     * Sets up the test environment before each test case.
     */
    @BeforeEach
    public void setup() {
        userService = new UserService();
    }

    /**
     * Tests the creation of a new user.
     */
    @Test
    public void testCreateUser() {
        User user = userService.createUser("John", "Doe");
        assertNotNull(user);
        assertEquals("John", user.getFirstName());
        assertEquals("Doe", user.getLastName());
    }
}
