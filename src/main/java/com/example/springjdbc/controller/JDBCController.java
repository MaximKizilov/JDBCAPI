package com.example.springjdbc.controller;

import com.example.springjdbc.service.JDBCService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JDBCController {
    private final JDBCService jdbcService;
    public JDBCController(JDBCService jdbcService) {
        this.jdbcService = jdbcService;
    }
    @GetMapping("/products/fetch-product")
    public ResponseEntity<List<String>> getProduct(@RequestParam String name) {
        try {
            return ResponseEntity.ok(jdbcService.getProduct(name));
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }
}
