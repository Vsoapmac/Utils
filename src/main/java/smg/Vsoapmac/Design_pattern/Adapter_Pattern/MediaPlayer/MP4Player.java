package smg.Vsoapmac.Design_pattern.Adapter_Pattern.MediaPlayer;

//AdvancedMediaPlayer的功能实现类
public class MP4Player implements AdvancedMediaPlayer{
    @Override
    public void playMP4(String fileName) {
        System.out.println("Play MP4 in file :" + fileName);
    }

    @Override
    public void playGAME(String fileName) {
        //do nothing
    }
}
