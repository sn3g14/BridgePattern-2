package pattern.bridge;

public abstract class RemoteControl {
	private TV tv;
	
	public RemoteControl(TV tv) {
		this.tv = tv;
	}
	public void turnOn() {
		this.tv.on();
	}
	public void turnOff() {
		this.tv.off();
	}
	public void setChannel(int channel) {
		this.tv.switchChannel(channel);
	}
}
