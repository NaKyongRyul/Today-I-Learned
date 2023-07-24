package test.exam;

public class Audio extends Elec implements ElecFunction{
	private int volumn;
	
	Audio() {}
	Audio(int volumn) {
		this.volumn = volumn;
	}
	Audio(String code, int cost, int volumn) {
		super(code, cost);
		this.volumn = volumn;
	}
	
	public void start() {
		System.out.println(getCode() + "의" + getClass().getSimpleName() + "를 " + volumn + "듣는다.");
	}
	
	public void stop() {}
	
	public void display() {}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.getClass().getSimpleName());
		builder.append("[ ");
		builder.append(super.toString());
		builder.append(", volumn=");
		builder.append(volumn);
		builder.append("]");
		return builder.toString();
	}
	
	
}
