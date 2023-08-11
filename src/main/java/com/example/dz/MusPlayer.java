package com.example.dz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusPlayer {

    // @Autowired // звязка класів через поля
    private DrumM drumM;
   // @Autowired // звязка класів через поля
    private RockM rockM;

  //  @Autowired // завдяки цій анотації звязали муз плеіз з класами через конструкктор
    public MusPlayer(@Qualifier("drumM") DrumM drumM, // тут вказуємо з якими саме
                     @Qualifier("rockM")RockM rockM) {
        this.drumM = drumM;
        this.rockM = rockM;
    }
    @Autowired // звязка через сетери
    public void setDrumM(DrumM drumM) {
        this.drumM = drumM;
    }
    @Autowired // звязка через сетери
    public void setRockM(RockM rockM) {
        this.rockM = rockM;
    }

    public void playM(Genre genre){

        double a = (int) (Math.random()*5);

        switch (genre){
            case DRUMANDBUSS:
                System.out.println(drumM.getSongs().get((int)a));
                break;
            case ROCK:
                System.out.println(rockM.getSongs().get((int)a));
                break;
            default:
                System.out.println("Lets start");
        }


    }
}
