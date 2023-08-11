package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component // тепер спринг створе біни цього класу
public class MusicPlayer {

    /* private HipHopMusic hipHopMusic;
     private ClassicalMusic classicalMusic;

     @Autowired // створили залежність для двох класів
     public MusicPlayer(HipHopMusic hipHopMusic, ClassicalMusic classicalMusic) {
         this.hipHopMusic = hipHopMusic;
         this.classicalMusic = classicalMusic;
     }
 */
   /*  @Autowired // також можна через поле але не рекомендовано
     @Qualifier("rockMusic") // анатація допоможе вказати бін якого саме класу нам використовувати
    private Music music; */

    private Music music1;
    private Music music2;

    @Autowired // таким чином через конструктор
    public MusicPlayer(@Qualifier("rapMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    //  private List<Music> musicList;

   /* private ClassicalMusic classicalMusic;

    @Autowired // внедряемо залежність для класу ClassicalMusic завдяки конструктору
    public MusicPlayer(ClassicalMusic classicalMusic) { // очікуємо що спрінг внедрить бін класикал музик
        this.classicalMusic = classicalMusic;
    } */

    // тепер робимо залежність для усіх класів

     /* @Autowired // внедреніє залажності через конструктор

    public MusicPlayer(Music music) {
        this.music = music;
    } */

    // @Autowired // внедреніє залажності через конструктор
    // public MusicPlayer(List<Music> musicList) {
    //    this.musicList = musicList;
    //  }

    /* @Autowired // внедреніє залажності через сеттер так свмо як через конструктор
    @Qualifier("rockMusic") // анатація допоможе вказати бін якого саме класу нам використовувати
    public void setMusic(Music music) { // спрінгу без різниці як зветься метод якщо є @Autowired
        this.music = music;
    } */

   /* public void playMusic() {
        System.out.println("Playing - " + music.getSong());
    } */

   /* public void playMusic3() {
        System.out.println("Playing - " + hipHopMusic.getSong());
        System.out.println("Playing - " + classicalMusic.getSong());
    } */

 /*  public String playMusic4() {
        return "Playing - " + music.getSong();
    }  */


 /*   public void playMusic2() {
        for (Music mu : musicList) {
            System.out.println("Playing - " + mu.getSong());
        }
    }  */

    public String playMusic5() {
        return "Playing - " + music1.getSong()+ " +  " + music2.getSong();

    }


}
