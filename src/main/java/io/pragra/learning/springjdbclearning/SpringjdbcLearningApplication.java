package io.pragra.learning.springjdbclearning;

import io.pragra.learning.springjdbclearning.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringjdbcLearningApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringjdbcLearningApplication.class, args);

        UserDAO dao = context.getBean(UserDAO.class);
        dao.readAndprintUsers();
    }

}
