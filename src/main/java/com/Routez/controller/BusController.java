package com.Routez.controller;


import com.Routez.payload.BusDto;
import com.Routez.service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("/api/v1/bus")
public class BusController {

    @Autowired
    private BusService busService;


    //http://localhost:8080/api/v1/bus/add
    @PostMapping("/add")
    public ResponseEntity<String> addBus(@RequestBody BusDto busDto) throws ParseException{

        busService.createBus(busDto);
        return new ResponseEntity<>("Bus details added", HttpStatus.OK);
    }





}