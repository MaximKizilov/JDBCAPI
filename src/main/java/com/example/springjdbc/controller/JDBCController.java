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
@RequestMapping("/products")
public class JDBCController {
    private final JDBCService jdbcService;
    public JDBCController(JDBCService jdbcService) {
        this.jdbcService = jdbcService;
    }
    @GetMapping("/fetch-product")
    public ResponseEntity<List<String>> getProduct(@RequestParam("name") String productName) {
        try {
            return new ResponseEntity<>(jdbcService.getProduct(productName), HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.I_AM_A_TEAPOT);
        }


    }
}
