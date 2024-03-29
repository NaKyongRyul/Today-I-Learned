package dto;

// WS_04 대비
// 새로운 클래스, extends AccountDto, period, amount , setter & getter toString, , private
public class LoanAccountDto extends AccountDto{
	private String mortgage;
	
	public LoanAccountDto(){}
	public LoanAccountDto(int accountSeq, String accountNumber, int balance, int userSeq, String mortgage){
		super(accountSeq, accountNumber, balance, userSeq);
		this.mortgage = mortgage;
	}
	
	public String getMortgage() {
		return mortgage;
	}
	public void setMortgage(String mortgage) {
		this.mortgage = mortgage;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.getClass().getSimpleName());
		builder.append(super.toString());
		
		builder.append(",mortgage=");
		builder.append(mortgage);
		builder.append("]");
		return builder.toString();
	}
	
	
}
