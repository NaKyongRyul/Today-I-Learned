package test.board;

/*
 * 모든 게시판의 공통의 기능 정의(규격서) 
 */
public interface BoardInterface {
	/*
	 * 등록하기 
	 * @return: 0이면 등록실패, 1이면 등록성공 
	 */
	int insert(Board board);//QA or UpLoad or Free
	
	/* 
	 * 글번호로 검색하기
	 */
	Board selectByBno(int bno);
	
	/* 
	 * 게시문 수정하기(글번호에 해당하는 제목, 내용을 수정한다) 
	 */
	int update(Board board);
	
	/////////////////////////////////////////////////
	/*
	 * java 1.8 version 추가된 문법 
	 * : 인터페이스 안에 default 또는 static 제한자를 메소드에 선언하면 
	 *   body가 있는 메소드를 만들 수 있다. 
	 *   : 공통의 기능이 있다면 미리 기능을 정의할 수 있고
	 *     적절하게 필요한 구현체에서 재정의해서 사용할 수 있다. 
 *       : 유지보수할 때 특정 인터페이스에 메소드를 추가하게 되면
 *         필요없는 모든 구현객체들이 재정의해야하는 번거로움을 막을 수 있다.
	 * 
	 * 1) default: 반드시 구현객체를 이용해서 사용할 수 있다.
	 * 2) static : 구현객체 없이 바로 "인터페이스이름.메소드이름()"으로 사용할 수 있다. 
	 */
	
	/*
	 * 답변등록 
	 */
	default void replyInsert() {
		//System.out.println("답변등록입니다.");
	}
	
	static void selectAll() {
		System.out.println("selectAll입니다.");
	}
}
