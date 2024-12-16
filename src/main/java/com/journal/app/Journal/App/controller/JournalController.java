package com.journal.app.Journal.App.controller;

import com.journal.app.Journal.App.Helper.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class JournalController {

//    @Autowired
//    private Response response;

    @GetMapping
    public ResponseEntity<?> SayHello(){

        Response response = new Response();

        response.setMessage("Hey, Welcome to the system!");
        response.setStatusCode(HttpStatus.OK.value());
        response.setSuccess(true);
        return new ResponseEntity<>(response, HttpStatus.OK);
    };

}
