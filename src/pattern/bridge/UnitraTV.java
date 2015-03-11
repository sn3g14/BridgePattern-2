package pattern.bridge;

public class UnitraTV implements TV {
	@Override
	public void on() {
		System.out.println("Unitra turned on");
	}
	@Override
	public void off() {
		System.out.println("Unitra turned off");
	}
	@Override
	public void switchChannel(int channel) {
		System.out.println("Unitra is switching channel to: " + channel);
	}
}
