package creational.factory;

public class Main {
    public static void main(String[] args) {
        Notification notification=NotificationFactory.creatNotification(NotificationType.EMAIL);
        notification.notifyUser();
    }
}
