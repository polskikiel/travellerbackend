package com.traveller.controllers;

import com.traveller.model.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlacesController {

    private List<Place> places;

    @Autowired
    public PlacesController(List<Place> places) {
        this.places = places;
    }

    @GetMapping("/places")
    public List<Place> getPlaces(){
        return places;
    }
}
