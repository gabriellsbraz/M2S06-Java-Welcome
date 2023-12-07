package org.clamed.m2s06.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String createMessage(String name) {
        if (name != null && !name.isEmpty()) {
            return String.format("Bem vindo %s!", name);
        }
        return "Nome não pode ser vazio";
    }
}