package structural.bridge;

public class Remote {
    Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void togglePower(){
        if (device.isEnabled())
            device.disabled();
        else
            device.enable();
    }

    public void volumeDown(){
        Integer old= device.getVolume();
        device.setVolume(old-1);
    }

    public void volumeUp(){
        Integer old= device.getVolume();
        device.setVolume(old+1);
    }
    public void channelDown(){
        Integer old= device.getChannel();
        device.setVolume(old-1);
    }
    public void channelUp(){
        Integer old= device.getChannel();
        device.setVolume(old+1);
    }

}
