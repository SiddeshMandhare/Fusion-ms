package com.example.Fusion_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ml {
    @GetMapping("/ml")
    public String getData() {return  "Welcome to Fusion-ml class" ; }
}
