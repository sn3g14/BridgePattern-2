package pattern.bridge;

public class SamsungTV implements TV {
	@Override
	public void on() {
		System.out.println("Samsung turned on");
	}
	@Override
	public void off() {
		System.out.println("Samsung turned off");
	}
	@Override
	public void switchChannel(int channel) {
		System.out.println("Samsung is switching to: " + channel);
	}
}
