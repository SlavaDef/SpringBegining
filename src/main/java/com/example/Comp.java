package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// в комп внідряємо залежність муз плееір
@Component
public class Comp { // наче в компі є муз плеер

    private int id;
    private MusicPlayer musicPlayer;
    @Autowired
    public Comp(MusicPlayer musicPlayer) { // буде передавати в якості залежності бін муз плеера
        id = 1; // це поле не внідряється спрінгом
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "Computer id = "+ id + " " + musicPlayer.playMusic5();

    }
}
