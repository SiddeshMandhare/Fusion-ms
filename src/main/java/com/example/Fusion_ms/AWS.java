package com.example.Fusion_ms;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWS {
    @GetMapping("/AWS")
    public String getData() {return  "Welcome to Fusion-AWS class" ; }
}