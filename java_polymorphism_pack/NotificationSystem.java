package java_polymorphism_pack;

class Notification {

	void send() {

		System.out.println();
	}
}

class EmailNotification extends Notification {

	void send() {

		System.out.println("Send via email");

	}
}

class SMSNotification extends Notification {

	void send() {

		System.out.println("send via SMS");
	}
}

public class NotificationSystem {

	public static void main(String[] args) {

		Notification noti;

		noti = new EmailNotification();
		noti.send();
		noti = new SMSNotification();
		noti.send();

	}

}
