package org.clamed.m2s06.controllers;


import org.clamed.m2s06.service.WelcomeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class WelcomeController {
    private WelcomeService welcomeService;

    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @GetMapping
    public ResponseEntity<String> createMessage(@RequestParam(name = "name") String name) {
        String message = welcomeService.createMessage(name);
        return ResponseEntity.ok(message);
    }
}
