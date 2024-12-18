package com.journal.app.Journal.App.controller;

import com.journal.app.Journal.App.Helper.Response;
import com.journal.app.Journal.App.entity.JournalEntry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class JournalController {

    private Map<Integer, JournalEntry> map = new HashMap<>();

    @GetMapping
    public ResponseEntity<?> SayHello(){
        Response response = new Response();
        response.setMessage("Hey, Welcome to the system!");
        response.setStatusCode(HttpStatus.OK.value());
        response.setSuccess(true);
        return new ResponseEntity<>(response, HttpStatus.OK);
    };

    @GetMapping("/journal")
    public ResponseEntity<?> getAll(){

        Response response = new Response();
        response.setMessage("Data Fetched Successfully");
        response.setStatusCode(HttpStatus.OK.value());
        response.setSuccess(true);

        response.setData(map.values());

        return new ResponseEntity<>(response, HttpStatus.OK);
    };

    @PostMapping("/journal")
    public ResponseEntity<?> createEntry(@RequestBody JournalEntry entry){

        map.put(entry.getId(), entry);

        Response response = new Response();
        response.setMessage("Hey, entry created successfully!");
        response.setStatusCode(HttpStatus.CREATED.value());
        response.setSuccess(true);

        response.setData(map.values());

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    };

    @PatchMapping("/journal")
    public ResponseEntity<?> updateEntry(@RequestBody JournalEntry entry) {
        if (!map.containsKey(entry.getId())) {
            Response response = new Response();
            response.setMessage("Entry not found!");
            response.setStatusCode(HttpStatus.NOT_FOUND.value());
            response.setSuccess(false);
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }

        map.put(entry.getId(), entry);

        Response response = new Response();
        response.setMessage("Entry updated successfully!");
        response.setStatusCode(HttpStatus.OK.value());
        response.setSuccess(true);
        response.setData(map.values());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @DeleteMapping("/journal/{id}")
    public ResponseEntity<?> deleteEntry(@PathVariable int id) {
        if (!map.containsKey(id)) {
            Response response = new Response();
            response.setMessage("Entry not found!");
            response.setStatusCode(HttpStatus.NOT_FOUND.value());
            response.setSuccess(false);
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }

        map.remove(id);

        Response response = new Response();
        response.setMessage("Entry deleted successfully!");
        response.setStatusCode(HttpStatus.OK.value());
        response.setSuccess(true);
        response.setData(map.values());

        return new ResponseEntity<>(response, HttpStatus.OK);
    }

}