package com.example.dz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDz {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusPlayer musPlayer = context.getBean("musPlayer", MusPlayer.class);
        musPlayer.playM(Genre.DRUMANDBUSS);
        musPlayer.playM(Genre.ROCK);
        for (int i = 0; i < 15; i++) {
            System.out.println((int) (Math.random() * 5));
        }
    }
}

// створити список чи масив із 5 пісень
// в MusPlayer треба внідрити біни класів RockM і DrumM
// створити Енам с двома жанрами музики Драм і Рок
// зробити метод playM так щоб він приймав Енам
// в залежності від значення Енаму плеер повинен вивести рендомну музику за жанром
