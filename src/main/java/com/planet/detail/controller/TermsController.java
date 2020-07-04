package com.planet.detail.controller;

import com.planet.detail.entity.Planet;
import com.planet.detail.service.TermsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/terms")
public class TermsController {

    @Autowired
    private TermsService termsService;

    @GetMapping(path = "/planet-list")
    public List<Planet> planetList(){return termsService.getPlanet(); }

    @GetMapping(path = "/is-alligned")
    public boolean isAligned(@RequestParam("day") Long day){
        if(day == 0){
            return true;
        }else{
            return termsService.isAligned(day);
        }
    }

    @GetMapping(path = "/its-raining")
    public String itsRaining(@RequestParam("day") Long day){

        return termsService.isInATriangle(day);
    }
    @GetMapping(path = "/its-optimal")
    public boolean itsOptimal(@RequestParam("day") Long day){

        return termsService.itsOptimal(day);
    }
}
