package com.example.devopsfinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.devopsfinal.models.LogEntry;

public interface LogEntryRepository extends JpaRepository<LogEntry, Long> {
}