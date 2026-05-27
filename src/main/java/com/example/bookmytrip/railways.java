package com.example.bookmytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class railways {
    @GetMapping("/railways")
    public String getData() { return "Please book your train tickets from bookmytrip at 5% discount" ; }
}
