package pattern.bridge;

public class LogitechRemoteControl extends RemoteControl {
	public LogitechRemoteControl(TV tv) {
		super(tv);
	}
	public void setChannelKeyboard(int channel) {
		setChannel(channel);
		System.out.println("Logitech");
	}
}
