package smg.Vsoapmac.Design_pattern.Adapter_Pattern.MediaPlayer;

import smg.Vsoapmac.Design_pattern.Adapter_Pattern.Adapter.MediaAdapter;

public class MediaPlay implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        /**
         * 在使用MediaPlay的时候，由于不支持MP4和Game的播放，我们可以调用适配器可以适配MP4和Game的播放
         * 因此，适配器针对的是无法实现更多功能的对象
         */
        switch (audioType){
            case "MP3":
                System.out.println("Play MP3 in file :" + fileName);
            case "MP4":
                MediaAdapter MP4Media = new MediaAdapter(audioType);
                MP4Media.play(audioType , fileName);
            case "Game":
                MediaAdapter GameMedia = new MediaAdapter(audioType);
                GameMedia.play(audioType , fileName);
            case "txt":
                System.out.println("cannot play.Type:dont know what audioType it is");
        }
    }
}
