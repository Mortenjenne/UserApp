
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User user;

    @BeforeEach
    void setUp(){
        user = new User("Test","TestPassword");
    }

    @Test
    public void testValidNames(){
        assertTrue(user.isNameValid("Morten"));
        assertTrue(user.isNameValid("Ib"));
        assertTrue(user.isNameValid("HansHansHans"));
        assertTrue(user.isNameValid("LotteLottelo"));
    }

    @Test
    public void testInvalidNames() {
        assertFalse(user.isNameValid("morten"));
        assertFalse(user.isNameValid("A"));
        assertFalse(user.isNameValid("HansHansHansen"));
    }

    @Test
    public void testValidEmails() {
        assertTrue(user.isEmailValid("morten@example.dk"));
        assertTrue(user.isEmailValid("Lotte@microsoft.com"));
    }

    @Test
    public void testInvalidEmails() {
        assertFalse(user.isEmailValid("username.dk"));
        assertFalse(user.isEmailValid("@missingdomain.com"));
        assertFalse(user.isEmailValid("username@.com"));
        assertFalse(user.isEmailValid("username@site."));
        assertFalse(user.isEmailValid(null));
        assertFalse(user.isEmailValid(""));
    }

    @Test
    public void testToStringWithOnlyNameAndPassword() {
        User user = new User("Anna", "pass");
        String expected = "Name: Anna | Password: pass";
        assertEquals(expected,user.toString());
    }

    @Test
    public void testToStringWithOnlyNameAndPasswordAndEmail() {
        User user = new User("Flemming", "pass", "test@test.com");
        String expected = "Name: Flemming | Password: pass | Email: test@test.com";
        assertEquals(expected,user.toString());
    }

    @Test
    public void testToStringWithAllFields() {
        User user = new User("Jesper", "pass", "jesper@mail.com", 123456);
        String expected = "Name: Jesper | Password: pass | Email: jesper@mail.com | Phone number: 123456";
        assertEquals(expected,user.toString());
    }

    @Test
    public void testCompareTo() {
        List<User> users = new ArrayList<>();
        User user1 = new User("Jesper", "pass");
        User user2 = new User("Anna", "pass");
        users.add(user1);
        users.add(user2);

        Collections.sort(users);
        String expected = "Anna";

        assertEquals(expected,users.get(0).getName());
    }


}