package day04.inheritance;

class Car{
	public String carname;
	public int cost;
	
	protected void printAttributes(){
		System.out.println("carname="+carname+"\tcost="+cost);
	}
}

//Car를 상속받는 EfSonata, Excel, Carnival 3개 클래스 작성	
//각 클래스에 인수를 받지않는 생성자 작성
//각 클래스의 생성자의 구현부에서 carname과 cost에 적당한 값 할당 = 대입 
class EfSonata extends Car {
	public EfSonata() {
		carname = "EfSonata";
		cost = 2000;
	}
}

class Excel extends Car {
	String color = "blue";
	public Excel() {
		carname = "Excel";
		cost = 4000;
	}
}
	
class Carnival extends Car {
	public Carnival() {
		carname = "Carnival";
		cost = 5000;
	}
}	

public class InheritanceExam{
	//메인메소드에서 
	//Car, EfSonata, Excel, Canival 네개의 객체를 생성
	// 각 클래스에서 Car calss에있는 printAttributes()메소드를 호출할수있다.
	public static void main(String[] args) {
		Car car = new Car();
		EfSonata efSonata = new EfSonata();
		Excel excel = new Excel();
		Carnival carnival = new Carnival();
		
		car.printAttributes();
		efSonata.printAttributes();
		excel.printAttributes();
		carnival.printAttributes();
	}
	
}

