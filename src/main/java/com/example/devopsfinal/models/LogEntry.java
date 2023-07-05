package com.example.devopsfinal.models;
import jakarta.persistence.*;
import java.util.Date;


@Entity
public class LogEntry {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private Date timestamp;
    private String endpoint;

    protected LogEntry() {}

    public LogEntry(String endpoint, Date timestamp) {
        this.endpoint = endpoint;
        this.timestamp = timestamp;
    }
    // getters and setters

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
