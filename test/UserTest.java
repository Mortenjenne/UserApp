
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
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
        User user1 = new User("Anna", "pass");
        User user2 = new User("Jesper", "pass");
        User user3 = new User("Anna", "pass");

        assertTrue(user1.compareTo(user2) < 0);
        assertTrue(user2.compareTo(user1) > 0);
        assertEquals(0, user1.compareTo(user3));
    }


}