package com.boot.das.boot.controller;

import com.boot.das.boot.model.Shipwreck;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//mvn package spring-boot:repackage build jar

@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {


    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list(){

        return ShipwreckStub.list();
    }

}
