package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import dto.AccountDto;
import dto.UserDto;

public interface BankService {
	 /**
	  * userSeq에 해당하는 계좌정보 조회
	  * */
     ArrayList<AccountDto> getAccountList(int userSeq ) ;
	
     
     /**
	  * userSeq에 해당하는 회원정보 조회
	  * */
	 UserDto getUserDetail(int userSeq) ;
	
	 /**
	  * 전체 계좌목록 조회 
	  * */
	 ArrayList<AccountDto> getAccountList( ) ;
	
	 /**
	  * 잔액을 기준으로 정렬
	  * */
	 ArrayList<AccountDto> getAccountListSortByBalance( ) ;
	 
	 /**
	  * userSeq를 기준으로 정렬
	  * 단, userSeq 같으면  잔액을 기준으로 정렬
	  * */
	 ArrayList<AccountDto> getAccountListSortByUserSeq( ) ;
}
