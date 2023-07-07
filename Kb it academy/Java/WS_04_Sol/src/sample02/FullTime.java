package sample02;

public class FullTime extends Employee{
	private int salary;
	private int bonus;
	
	FullTime() {}
	FullTime(int empNo, String eName, String job, int mgr, String hiredate, String deptName,int salary,int bonus) {
//		setEmpNo(empNo);
//		seteName(eName);
//		setJob(job);
//		setMgr(mgr);
//		setHiredate(hiredate);
//		setDeptName(deptName);
		super(empNo, eName, job, mgr, hiredate, deptName);
		this.salary = salary;
		this.bonus = bonus;		
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(" salary=" + salary + ", bonus=" + bonus);
		return sb.toString();
	}

	public void message() {
		System.out.println(geteName() +"사원은 정규직입니다.");
	}
	
}
