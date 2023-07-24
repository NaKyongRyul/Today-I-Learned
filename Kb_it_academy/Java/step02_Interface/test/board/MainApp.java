package test.board;

public class MainApp {
	static BoardInterface service;
	
	public MainApp() {
		//service 메소드 3개를 호출해보자 
		//QA
		service = new QABoardServiceImpl();
		test(service);
		
		//Uplad
		service = new UploadBoardServiceImpl();
		test(service);
		
		//Free
		service = new FreeBoardServiceImpl();
		test(service);
	}
	
	public void test(BoardInterface service) {
		service.insert(null);
		service.selectByBno(0);
		service.update(null);
		
		//추가된 메소드 호출
		service.replyInsert();
		BoardInterface.selectAll();
	}

	public static void main(String[] args) {
		System.out.println("****다형성 TEST****");
		new MainApp();
	}

}
