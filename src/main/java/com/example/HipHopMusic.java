package com.example;

import org.springframework.stereotype.Component;

@Component
public class HipHopMusic implements Music{
    @Override
    public String getSong() {
        return "Madonna : Day another day";
    }
}
