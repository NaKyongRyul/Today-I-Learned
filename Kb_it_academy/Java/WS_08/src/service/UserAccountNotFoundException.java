package service;

public class UserAccountNotFoundException extends Exception {
	public UserAccountNotFoundException() {
		super("사용자 또는 계좌정보를 찾을 수 없습니다.");
	}
	
	public UserAccountNotFoundException(String s) {
		super(s);
	}
}
