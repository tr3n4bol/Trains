package com.example.Trains.controllers;

import com.example.Trains.entities.Station;
import com.example.Trains.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class SearchController {

    @Autowired
    private StationRepository stationRepository;

    @GetMapping("/results")
    public String showResults(
            @RequestParam String from,
            @RequestParam String to,
            @RequestParam String date,
            Model model) {
        List<Station> stations = stationRepository.findAll();
        model.addAttribute("stations", stations);

        model.addAttribute("fromCity", from);
        model.addAttribute("toCity", to);
        model.addAttribute("date", date);

        return "results";
    }

}
