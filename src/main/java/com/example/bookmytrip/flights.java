package com.example.bookmytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class flights {
    @GetMapping("/flights")
    public String getData() { return "Please book your flight tickets from bookmytrip at 10% discount" ; }
}
