package smg.Vsoapmac.Design_pattern.Adapter_Pattern.MediaPlayer;

//AdvancedMediaPlayer的功能实现类
public class GamePlayer implements AdvancedMediaPlayer{
    @Override
    public void playMP4(String fileName) {
        //Do nothing
    }

    @Override
    public void playGAME(String fileName) {
        System.out.println("Playing Game in file :" + fileName);
    }
}
