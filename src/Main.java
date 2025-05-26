import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        printUsers();

    }

    public static void printUsers(){
        List<User> users = new ArrayList<>();
        users.add(new User("Jesper","repseJ1234"));
        users.add(new User("Signe","engiS1234","Signe@gmail.com"));
        users.add(new User("Ida","Blåbærbusk35","ida1984@gmail.com",54679823));

        for(User user: users){
            System.out.println(user);
        }
    }
}