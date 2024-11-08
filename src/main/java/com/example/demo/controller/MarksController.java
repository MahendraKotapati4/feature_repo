package com.example.demo.controller;

import com.example.demo.dao.MarksDao;
import com.example.demo.service.MarksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MarksController {

    @Autowired
    private MarksService marksService;

    @PostMapping("/marks")
    public void saveMarks(@RequestBody MarksDao marksDao){
        marksService.saveMarks(marksDao);
       //return  new ResponseEntity(null,null);
    }
}
