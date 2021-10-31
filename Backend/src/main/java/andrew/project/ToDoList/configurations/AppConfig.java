package andrew.project.ToDoList.configurations;

import andrew.project.ToDoList.api.services.IToDoService;
import andrew.project.ToDoList.services.ToDoServices;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public IToDoService toDoService() {
        return new ToDoServices();
    }

}
