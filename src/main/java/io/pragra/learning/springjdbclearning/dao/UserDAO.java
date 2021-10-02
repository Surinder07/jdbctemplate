package io.pragra.learning.springjdbclearning.dao;

import io.pragra.learning.springjdbclearning.domain.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO {

    private JdbcTemplate jdbcTemplate;

    public UserDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void readAndprintUsers(){
        String sql = "Select * from user_detail";
        List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(User.class));

        users.forEach(System.out::println);


    }
}
