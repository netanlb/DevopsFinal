package com.example.devopsfinal.controllers;
import com.example.devopsfinal.models.LogEntry;
import com.example.devopsfinal.repositories.LogEntryRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class LogController {
    private final LogEntryRepository logEntryRepository;

    public LogController(LogEntryRepository logEntryRepository) {
        this.logEntryRepository = logEntryRepository;
    }
    @GetMapping("/logs")
    public List<LogEntry> showLogs() {
        // Save a new log entry with current timestamp and endpoint
        logEntryRepository.save(new LogEntry("/logs", new Date()));

        // Fetch all log entries from database and return them
        return logEntryRepository.findAll();
    }

    @GetMapping("/transaction")
    public String createTransaction() {
        // Add logic here to create a transaction
        return "Transaction created";
    }
}
