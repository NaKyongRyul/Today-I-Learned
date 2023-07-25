package com.itskb.ws03.view;

import java.util.List;

import com.itskb.ws03.dto.AccountDto;
import com.itskb.ws03.dto.UserDto;
import com.itskb.ws03.service.BankService;

public class TestView {

	public static void main(String[] args) {
		System.out.println("***1. 고객seq에 해당하는 계좌정보 검색하기 *****");
		BankService service = new BankService();
		
		List<AccountDto> accountList = service.getAccountList(100);
		
		if(accountList.isEmpty()) {
			System.out.println("회원의 계좌정보가 없습니다. ");
		}else {
			System.out.println("회원계좌개수 : " + accountList.size());
			for(AccountDto dto : accountList) {
				System.out.println(dto.accountSeq +" , " + dto.accountNumber+" , " + dto.userSeq+" , ");
				
			}
		}
		
		
		System.out.println("\n\n***2. userSeq에 해당하는 고객의 정보 *************");
		UserDto userDto = service.getUserDetail(100);
		if(userDto!= null) {
		  System.out.print(userDto.userSeq +" , " + userDto.name+" , " + userDto.email+" , ");
		  System.out.println(userDto.phone +" , " + userDto.isSleep);
			
		}else {
			System.out.println("회원의 정보가 없습니다.");
		}
		
		/////////추가된 메소드 호출해보자///////////////////
		System.out.println("1. 모든 계좌정보 조회 ------");
		print(service.getAccountList());
		
		System.out.println("2.잔액기준으로 정렬하기 -------------");
		print(service.getAccountListSortByBalance());
		
		
		System.out.println("3.UserSeq 기준으로 정렬하기 -------------");
		print(service.getAccountListSortByUserSeq());
		
		
		System.out.println("4. 모든 계좌정보 조회 ------");
		print(service.getAccountList());

	}//메인끝
	
	/**
	 * 계좌목록 출력하기
	 * */
	public static void print(List<AccountDto> accountList) {
		System.out.println("******************************");
		for (AccountDto accountDto : accountList) {
			System.out.println(accountDto);
		}
		System.out.println();
	}

}// 클래스 끝





