package com.journal.app.Journal.App.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
public class JournalEntry {
    private int id;
    private String title;
    private String content;

    public JournalEntry() {
    }

    public JournalEntry(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
