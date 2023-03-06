import java.io.FileWriter;
import java.io.IOException;

public class LoginInterceptor {

    public void login(String username, String password) {
        try (FileWriter fileWriter = new FileWriter("username.txt")) {
            fileWriter.write(username);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}