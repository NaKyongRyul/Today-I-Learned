package service;

public class BalanceLackException extends Exception {
	public BalanceLackException() {
		super("잔액부족입니다.");
	}
	public BalanceLackException(String s) {
		super(s);
	}

}
