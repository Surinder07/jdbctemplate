package io.pragra.learning.springjdbclearning;

import io.pragra.learning.springjdbclearning.dao.UserDAO;
import io.pragra.learning.springjdbclearning.domain.User;
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

      //  System.out.println(dao.addUser(new User(101, "shubham", "Singh")));

        User user = dao.findUserById(102);
        user.setLastName("S");
        dao.updateUser(user);

       // dao.creatStudentTable();

        dao.findAllByLastName("Singh").forEach(System.out::println);


    }

}
