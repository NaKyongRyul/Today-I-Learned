package sample02;

public class PartTime extends Employee{
	private int timePay;
	
	PartTime() {}
	PartTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName, int timePay) {
//		setEmpNo(empNo);
//		seteName(eName);
//		setJob(job);
//		setMgr(mgr);
//		setHiredate(hiredate);
//		setDeptName(deptName);
		super(empNo, eName, job, mgr, hiredate, deptName);
		this.timePay = timePay;
	}
	public int getTimePay() {
		return timePay;
	}
	public void setTimePay(int timePay) {
		this.timePay = timePay;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(" timePay=" + timePay);
		return sb.toString();
//		return getEmpNo() + " | "+ geteName() +" | "+ getJob() +" | "+ getMgr()+ " | "+ getHiredate() +" | "+ getDeptName() +" | "+getTimePay();
	}
	void message() {
		System.out.println(geteName() +"사원은 비정규직입니다.");
	}
}
