import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> userData = addUsers();
        userData = sortUsersByName(userData);
        printUsers(userData);
    }

    private static void printUsers(List<User> users){
        for(User user: users){
            System.out.println(user);
        }
    }

    private static List<User> sortUsersByName(List<User> users){
        Collections.sort(users);
        return users;
    }

    private static List<User> addUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Jesper", "repseJ1234"));
        users.add(new User("Anders", "And123"));
        users.add(new User("Morten", "M1234"));
        users.add(new User("Laura", "LauLau"));

        users.add(new User("igne", "engiS1234", "signe@gmail.com"));
        users.add(new User("Anna", "Annie56", "anna@hotmail.com"));
        users.add(new User("Thomas", "Thom123", "thomas@mail.dk"));

        users.add(new User("Camilla", "Cam456", "camilla@mail.dk", 98765432));
        users.add(new User("Ida", "Blaabaer35", "ida1984@gmail.com", 54679823));
        users.add(new User("Peter", "Peter99", "peter@mail.com", 12345678));

        return users;
    }


}