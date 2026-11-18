package com.quickbite.userservice;

import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbCheckController {
    private final JdbcTemplate jdbcTemplate;

    public DbCheckController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/db-check")
    public Map<String, Object> checkDatabase() {
        return jdbcTemplate.queryForMap(
            "select current_database() as database, current_user as username"
        );
    }
}
