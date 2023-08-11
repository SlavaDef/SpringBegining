package com.example.dz;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockM implements Muz{
    @Override
    public List<String> getSongs() {
        List<String> songs = new ArrayList<>();
        songs.add("Rammstein - Sonne");
        songs.add("Menson - New life");
        songs.add("Rammstein - Mutter");
        songs.add("Sustem of a down - wake up");
        songs.add("Limp Bizkit - Take look around");
        return songs;
    }
}
