package smg.Vsoapmac.Design_pattern.Adapter_Pattern.Adapter;

import smg.Vsoapmac.Design_pattern.Adapter_Pattern.MediaPlayer.AdvancedMediaPlayer;
import smg.Vsoapmac.Design_pattern.Adapter_Pattern.MediaPlayer.GamePlayer;
import smg.Vsoapmac.Design_pattern.Adapter_Pattern.MediaPlayer.MP4Player;
import smg.Vsoapmac.Design_pattern.Adapter_Pattern.MediaPlayer.MediaPlayer;

/**
 * 适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。
 *
 * 这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能。
 * 举个真实的例子，读卡器是作为内存卡和笔记本之间的适配器。将内存卡插入读卡器，再将读卡器插入笔记本，这样就可以通过笔记本来读取内存卡。
 */
public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    //实例化适配器时让MediaPlayer适配AdvancedMediaPlayer
    public MediaAdapter(String audioType){
        if(audioType.equalsIgnoreCase("Game") ){
            advancedMediaPlayer = new GamePlayer();
        } else if (audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new MP4Player();
        }
    }

    //处理MediaPlayer不支持的播放类型
    public void play(String audioType, String fileName) {
        switch (audioType){
            case "MP4":
                advancedMediaPlayer.playMP4(fileName);
            case "Game":
                advancedMediaPlayer.playGAME(fileName);
        }
    }
}
