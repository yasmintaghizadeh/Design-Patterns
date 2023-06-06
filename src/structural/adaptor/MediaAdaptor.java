package structural.adaptor;

public class MediaAdaptor implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

//    public MediaAdaptor(String audioType) {
//        if (audioType.equalsIgnoreCase("vlc")){
//
//        }else if (audioType.equalsIgnoreCase("mp4")){
//
//        }
//    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer=new VlcPlayer();
            advancedMediaPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer=new Mp4Player();
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
