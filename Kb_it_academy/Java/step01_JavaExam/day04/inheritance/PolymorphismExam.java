package day04.inheritance;

class CarCenter{
	public void engineer(Car cd){
		System.out.println("cd 주소 = " + cd);
		//Car cd변수로는 부모부분만 접근가능, 자식부분 불가능
		//cd.color = "RED"; -> 부모타입을 자식타입으로 변경하면 접근가능
		
		if(cd instanceof Excel) {//cd가 Excel 타입이 될 수 있나?
			//ObjectDownCasting 필요 -> ClassCastException 가능성 
			Excel e = (Excel)cd;//부모 자식 관계에서 부모가 더 크다 
			System.out.println("색상 = " + e.color);
			System.out.println("e 주소 = " + e);
			
			System.out.print(cd.carname+" 수리완료!\t");
			System.out.println("청구비용"+cd.cost+" 원");
			
		
		}
	}
}

public class PolymorphismExam{
	public static void main(String[] args) {	
		CarCenter cc=new CarCenter();
		EfSonata ef=new EfSonata();
		Carnival ca=new Carnival();
		Excel ex=new Excel();
		Car c= new Car();
		
		cc.engineer(c);//
		cc.engineer(ef);//
		cc.engineer(ca);//
		cc.engineer(ex);//
		
		System.out.println("ex 주소 = " + ex);
		System.out.println();
	}
}
