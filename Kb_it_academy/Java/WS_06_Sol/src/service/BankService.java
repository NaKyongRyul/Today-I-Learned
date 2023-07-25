package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import dto.AccountDto;
import dto.InstallAccountDto;
import dto.LoanAccountDto;
import dto.SavingAccountDto;
import dto.UserDto;

// WS_04 대비
// - 상속받은 하위클래스 객체 생성
// - dto 멤버를 직접 => getter
public class BankService {
	ArrayList<AccountDto> accountList = new ArrayList<>();;
	ArrayList<UserDto> userList = new ArrayList<>();

	public BankService() {
		userList.add( new UserDto(111, "홍길동", "hong@gildong@com", "010-1111-1111", false) );
		userList.add( new UserDto(222, "이길동", "lee@gildong@com", "010-2222-2222", true) );
		userList.add( new UserDto(333, "삼길동", "sam@gildong@com", "010-3333-3333", false) );
		
		accountList.add( new InstallAccountDto(20, "00200202002002", 1000, 111, 12, 10000) );
		
		accountList.add( new SavingAccountDto(10, "00100101001001", 500, 111, 100) );
		
		accountList.add( new LoanAccountDto(60, "00600606006006", 500, 333, "House") );
		accountList.add( new LoanAccountDto(30, "00300303003003", 0, 111, "Building") );
		
		accountList.add( new SavingAccountDto(70, "00700707007007", 500, 333, 200) );
		
		accountList.add( new LoanAccountDto(50, "00500505005005", 200, 222, "Car") );
		accountList.add( new SavingAccountDto(40, "00400404004004", 1000, 222, 50) );
	}
	
	
	public ArrayList<AccountDto> getAccountList(int userSeq ) {
		
		ArrayList<AccountDto> userAccountList = new ArrayList<>();;

		for (int i = 0; i < accountList.size(); i++) {
			AccountDto accountDto = userAccountList.get(i);
			if( accountDto.getUserSeq() == userSeq ) userAccountList.add( accountDto );
		}
		return accountList;
	}
	
	public UserDto getUserDetail(int userSeq) {
		for (UserDto userDto : userList) {
			if( userDto.getUserSeq() == userSeq ) return userDto;
		}
		return null;
	}
	
	// 아래 메소드 WS_04 추가
	public ArrayList<AccountDto> getAccountList( ) {
		
		return this.accountList;
	}
	
	public ArrayList<AccountDto> getAccountListSortByBalance( ) {
		
		// 원본 ArrayList 는 등록순으로 순서를 유지해야 하므로 새로운 ArrayList 로 객체 복사 (객체는 공유 - swallow copy) 
		ArrayList<AccountDto> accountListSort = new ArrayList<>(accountList);
		
		Collections.sort(accountListSort);
		return accountListSort;
	}
	
	public ArrayList<AccountDto> getAccountListSortByUserSeq( ) {
		
		// 원본 ArrayList 는 등록순으로 순서를 유지해야 하므로 새로운 ArrayList 로 객체 복사 (객체는 공유 - swallow copy) 
		ArrayList<AccountDto> accountListSort = new ArrayList<>(accountList);
		
		
		// AccountDto 에 implments Comparable 을 수정하지 않고, Comparator 이용
		// userSeq 가 동일하면 balance 로 정렬
		Collections.sort(accountListSort, new Comparator<AccountDto>() {

			@Override
			public int compare(AccountDto o1, AccountDto o2) {
				// TODO Auto-generated method stub
				return ( o1.getUserSeq() - o2.getUserSeq() ) == 0 ? o1.getBalance() - o2.getBalance() : o1.getUserSeq() - o2.getUserSeq();
			}
			
		});
		return accountListSort;
	}
}
