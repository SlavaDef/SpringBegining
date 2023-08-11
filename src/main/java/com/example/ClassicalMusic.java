package com.example;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "N.Mozart - Mazdai";
    }
}
