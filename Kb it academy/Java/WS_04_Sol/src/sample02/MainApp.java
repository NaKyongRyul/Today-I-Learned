package sample02;

public class MainApp {

	public static void main(String[] args) {
		//Employee [] full = new FullTime[3];
		//Employee [] part = new PartTime[2];
		Employee [] employee = new Employee[5];
		
		/*full[0] = new FullTime(10, "유재석", "개그우먼", 0 , "2013-05-01", "무한도전",8500,200);
		full[1] = new FullTime(20, "박명수", "가수",10, "2013-06-20", "무한도전",7500,100);
		full[2] = new FullTime(30, "정준하", "예능인",10 , "2013-06-22", "무한도전",6000,0);
		
		part[0] = new PartTime(40, "노홍철", "예능인",20 , "2014-05-01", "무한도전",20000);
		part[1] = new PartTime(50, "하하", "가수",30 , "2014-05-02", "무한도전",25000);*/
		
		employee[0] = new FullTime(10, "유재석", "개그우먼", 0 , "2013-05-01", "무한도전",8500,200);
		employee[1] = new FullTime(20, "박명수", "가수",10, "2013-06-20", "무한도전",7500,100);
		employee[2] = new FullTime(30, "정준하", "예능인",10 , "2013-06-22", "무한도전",6000,0);
		employee[3] = new PartTime(40, "노홍철", "예능인",20 , "2014-05-01", "무한도전",20000);
		employee[4] = new PartTime(50, "하하", "가수",30 , "2014-05-02", "무한도전",25000);
		
		
		/*System.out.println("*************FullTime 정보*************");
		for(Employee fu:full) {
			System.out.println(fu);
		}
		
		System.out.println("\n*************PartTime 정보*************");
		for(Employee pa:part) {
			System.out.println(pa);
		}*/
		
		System.out.println("*************EmployeeTime 정보*************");
		for(Employee em:employee) {
			System.out.println(em);
		}
		System.out.println("\n************* Message *************");
		
		/*for(Employee fu:full) {
			fu.message();
		}
		for(Employee pa:part) {
			pa.message();
		}*/
		for(Employee em:employee) {
			em.message();
		}
	}

}
