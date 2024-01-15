package lesson.lesson_36;

import org.springframework.context.annotation.Bean;

public class AppConfig {
    @Bean(name="springHelloWorld")
    public SpringHelloWorld getSpringHelloWorld(){
        return new SpringHelloWorld();
    }

    @Bean(name="message")
    public String getMessage(){
        String message = "Hello TMS team!";
        return message;
    }

}
