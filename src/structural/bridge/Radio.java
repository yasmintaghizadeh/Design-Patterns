package structural.bridge;

public class Radio implements Device{

    private boolean enable;
    private Integer volume;
    private Integer channelNumber;

    public Radio(boolean enable, Integer volume, Integer channelNumber) {
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
        System.out.println("the radio is on");
        enable=true;

    }

    @Override
    public void disabled() {
        System.out.println("the radio is off");
        enable=false;
    }

    @Override
    public Integer getVolume() {
        return volume;
    }

    @Override
    public void setVolume(Integer volume) {
        this.volume=volume;
        System.out.println("the volume is: " + volume);
    }

    @Override
    public Integer getChannel() {
        return channelNumber;
    }

    @Override
    public void setChannel(Integer channel) {
        this.channelNumber=channel;
        System.out.println("now playing channel number: "+ channelNumber);
    }
}
