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
        // Just return the logs without creating a new one
        return logEntryRepository.findAll();
    }

    @GetMapping("/transaction")
    public String createTransaction() {
        // This should create a new log entry when accessed
        LogEntry logEntry = new LogEntry("/transaction", new Date());
        logEntryRepository.save(logEntry);
        return "A new transaction has been created.";
    }
}
