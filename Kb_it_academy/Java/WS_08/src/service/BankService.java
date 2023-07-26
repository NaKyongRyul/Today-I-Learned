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
	 
	 /**
	  * 고객의 일련번호와 계좌 일련번호 입력, 계좌정보 리턴 
	  * 일치하는 계좌가 없을 경우, userAccountNotFoundException 발생
	  * 이 요청을 수행하는 코드에서 처리
	  */
	 AccountDto getUserAccount(int userSeq, int accountSeq) throws UserAccountNotFoundException;
	 
	 /**
	  * 고객의 일련번호, 계좌 일련번호, 출금금액을 입력받아 출금 처리
	  * 잔액이 부족하면 BalanceLackException 발생
	  * 이 요청을 수행하는 코드에서 처리 
	  */
	 int withdraw(int userSeq, int accountSeq, int amount) throws BalanceLackException, UserAccountNotFoundException;
}
