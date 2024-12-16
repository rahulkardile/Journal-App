package com.journal.app.Journal.App.Helper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

//@Component
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Response {
    private String message;
    private int statusCode;
    private boolean success;


    public Response() {

    }

    public Response(String message, int statusCode, boolean success) {
        this.message = message;
        this.statusCode = statusCode;
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
