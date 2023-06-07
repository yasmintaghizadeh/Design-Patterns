package structural.bridge;

public class Tv implements Device{
    private boolean enable;
    private Integer volume;
    private Integer channelNumber;

    public Tv(boolean enable, Integer volume, Integer channelNumber) {
        this.enable = enable;
        this.volume = volume;
        this.channelNumber = channelNumber;
    }

    @Override
    public boolean isEnabled() {
        return enable;
    }

    @Override
    public void enable() {
        System.out.println("the tv is on");
        enable=true;
    }

    @Override
    public void disabled() {
        System.out.println("the tv is off");
        enable=false;
    }

    @Override
    public Integer getVolume() {
        return volume;
    }

    @Override
    public void setVolume(Integer volume) {
    this.volume=volume;
        System.out.println("the tv is now playing with volume of: "+volume);
    }

    @Override
    public Integer getChannel() {
        return channelNumber;
    }

    @Override
    public void setChannel(Integer channel) {
        this.channelNumber=channel;
        System.out.println("the tv is on channel: "+channel);
    }
}
