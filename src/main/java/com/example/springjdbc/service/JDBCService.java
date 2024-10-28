package com.example.springjdbc.service;

import com.example.springjdbc.repository.JDBCRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JDBCService {
    private final JDBCRepository jdbcRepository;
    public JDBCService(JDBCRepository jdbcRepository) {
        this.jdbcRepository = jdbcRepository;
    }
    public List<String> getProduct(String name) {
        return jdbcRepository.getProduct(name);
    }
}
