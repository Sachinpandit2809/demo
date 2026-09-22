package com.example.demo.Notification;

public class EmailServices  implements NotificationServices {

        @Override
        public void  sendNotification(){
            System.out.println("Email Notification send");
    }
}
