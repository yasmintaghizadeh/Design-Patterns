package structural.bridge;

public interface Device {
    boolean isEnabled();
    void enable();
    void disabled();
    Integer getVolume();
    void setVolume(Integer volume);
    Integer getChannel();
    void setChannel(Integer channel);
}
