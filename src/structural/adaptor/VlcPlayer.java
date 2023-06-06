package structural.adaptor;

public class VlcPlayer implements AdvancedMediaPlayer{


    @Override
    public void playVlc(String filename) {
        System.out.println("playing vlc file: " + filename);
    }

    @Override
    public void playMp4(String filename) {

    }
}
