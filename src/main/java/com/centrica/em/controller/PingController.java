package com.centrica.em.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

    // @GetMapping("/")
    // public String root() {
    //     return "Welcome to EM backend API!";
    // }

    @GetMapping("/api/ping")
    public String ping() {
        return "pong";
    }
}
