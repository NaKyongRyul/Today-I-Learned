package test.exam;

public class Tv extends Elec implements ElecFunction{
	private int channel;
	Tv() {}
	Tv(int channel) {
		this.channel = channel;
	}
	Tv(String code, int cost, int channel) {
		super(code, cost);
		this.channel = channel;
	}
	
	public void start() {
		System.out.println(getCode() + "의" + getClass().getSimpleName() + "를 " + channel + "본다.");
	}
	public void stop() {}
	public void display() {}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.getClass().getSimpleName());
		builder.append("[ ");
		builder.append(super.toString());
		builder.append(", Tv [chnnel=");
		builder.append(channel);
		builder.append("]");
		return builder.toString();
	}
	
	
}
