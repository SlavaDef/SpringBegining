package com.example.dz;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DrumM implements Muz {
    @Override
    public List<String> getSongs() {
        List<String> songs = new ArrayList<>();
        songs.add("The Prodigy - Out of Space");
        songs.add("The Prodigy - Diesel Power");
        songs.add("Rudimental - Die young");
        songs.add("Dan Fable - Favorite song");
        songs.add("Heist - Noisestorm");
        return songs;
    }
}
