
import com.example.config.AppConfig;
import com.example.model.User;
import com.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        User user = new User();
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");

        userService.register(user);

        User retrievedUser = userService.getUser(1);
        System.out.println("Retrieved User: " + retrievedUser.getName() + ", " + retrievedUser.getEmail());

        context.close();
    }
}