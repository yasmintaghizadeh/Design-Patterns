package creational.factory;

public class NotificationFactory {
    public static Notification creatNotification(NotificationType channel){
        if (channel==null){
            return null;
        }
        switch (channel){
            case SMS:
                return new SmsNotification();
            case PUSH:
                return new PushNotification();
            case EMAIL:
                return new EmailNotification();
            default:
                throw  new IllegalArgumentException("Unknown Channel" +channel);
        }

    }
}
