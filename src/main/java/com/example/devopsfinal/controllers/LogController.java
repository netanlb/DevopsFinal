package com.example.devopsfinal.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class LogController {
    @GetMapping("/logs")
    public String showLogs() {
        // Add logic here to fetch and return logs
        return "Logs";
    }

    @GetMapping("/transaction")
    public String createTransaction() {
        // Add logic here to create a transaction
        return "Transaction created";
    }
}
