package com.journal.app.Journal.App.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class JournalEntry {
    private int id;
    private String title;
    private String content;
}
