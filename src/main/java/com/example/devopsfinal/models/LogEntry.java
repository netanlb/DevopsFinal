package com.example.devopsfinal.models;
import jakarta.persistence.*;
import java.util.Date;


@Entity
public class LogEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Date timestamp;
    private String endpoint;

    protected LogEntry() {
    }

}
