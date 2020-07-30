package smg.Vsoapmac.Design_pattern.Adapter_Pattern;

import smg.Vsoapmac.Design_pattern.Adapter_Pattern.MediaPlayer.MediaPlay;

public class Demo {
    public static void main(String[] args) {
        MediaPlay media = new MediaPlay();

        //使用时只需要调用MediaPlayer的实现类即可
        media.play("MP3" , "Sing Me to Sleep.MP3");
        System.out.println("分割线" + "---------------------");
        media.play("MP4" , "Hop.MP4");
        System.out.println("分割线" + "---------------------");
        media.play("Game" , "Dark Souls III.exe");
        System.out.println("分割线" + "---------------------");
        media.play("txt" , "By the song.txt");
    }
}
