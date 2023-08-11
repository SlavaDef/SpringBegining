package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        // тут зробили залежність для класу класік муз від муз плеер
        // якщо додати інші компоненти то вийде непорозуміння невказано біни яких класів юзати
        // можна через конструктор можна через сетер
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        // musicPlayer.playMusic(); // метод для програвання одного класу чи + анотація @Qualifier краще на сетері чи на полі
        //  musicPlayer.playMusic2(); // метод для програвання для усіх класів
        //  musicPlayer.playMusic3(); // метод для програвання двох класів

        // приклад залежності від залежності
         Comp comp = context.getBean("comp", Comp.class);
         System.out.println(comp);

        context.close();


    }
}
