package pattern.bridge;

public class App {
	public static void main(String[] args) {
		TV samsung = new SamsungTV();
		RemoteControl logitech = new LogitechRemoteControl(samsung);
		logitech.setChannel(17);
	}
}
