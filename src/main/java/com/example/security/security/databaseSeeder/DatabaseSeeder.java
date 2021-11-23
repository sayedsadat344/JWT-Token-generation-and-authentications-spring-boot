package com.example.security.security.databaseSeeder;

import com.example.security.baseApp.models.User;
import com.example.security.baseApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.logging.Logger;



/***
 * Developer: Sayed Hussainullah Sadat
 * Github: https://github.com/sayedsadat344
 * LinkedIn: https://www.linkedin.com/in/sayed-hussainullah-sadat-160800182/
 * Stack-overflow: https://stackoverflow.com/users/8985718/sayed-hussainullah-sadat
 */

@Component
public class DatabaseSeeder {

    private Logger logger = Logger.getLogger(String.valueOf(DatabaseSeeder.class));
    private UserRepository userRepository;

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public DatabaseSeeder(
            UserRepository userRepository,
            JdbcTemplate jdbcTemplate) {
        this.userRepository = userRepository;

        this.jdbcTemplate = jdbcTemplate;

    }

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        seedUsersTable();
//        seedCategoryTable();
//        seedSectionsTable();
//        seedTagsTable();
    }




    private void seedUsersTable() {
        String sql = "SELECT username, email FROM user_tbl U WHERE U.username = \"admin\" OR " +
                "U.email = \"admin@test.com\" LIMIT 1";
        List<User> u = jdbcTemplate.query(sql, (resultSet, rowNum) -> null);
        if(u == null || u.size() <= 0) {
            User user = new User();
            user.setName("Spring Security");
            user.setLastName("JWT Token");
            user.setUsername("admin");
            user.setEmail("admin@test.com");
            user.setPassword(new BCryptPasswordEncoder().encode("admin@123"));
//            user.setRole(Roles.SUPER_ADMIN.toString());
//            user.setBanned(false);
//            user.setConfirmEmail(true);
            userRepository.save(user);
            logger.info("Users Seeded");
        } else {
            logger.warning("Users Seeding Not Required");
        }
    }



}