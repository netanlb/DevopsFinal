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
    public LogEntry createTransaction() {
        // Save a new log entry with current timestamp and endpoint
        LogEntry logEntry = new LogEntry("/transaction", new Date());
        logEntryRepository.save(logEntry);

        // Return the saved log entry
        return logEntry;
    }
}
