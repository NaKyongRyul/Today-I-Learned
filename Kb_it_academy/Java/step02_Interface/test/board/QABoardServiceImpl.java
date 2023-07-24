package test.board;

public class QABoardServiceImpl implements BoardInterface {

	@Override
	public int insert(Board board) {
		System.out.println("QABoardServiceImpl의 insert call");
		return 0;
	}

	@Override
	public Board selectByBno(int bno) {
		System.out.println("QABoardServiceImpl의 selectByBno call");
		return null;
	}

	@Override
	public int update(Board board) {
		System.out.println("QABoardServiceImpl의 update call");
		return 0;
	}
	@Override
	public void replyInsert() {
		System.out.println("QABoardServiceImpl의 답변기능입니다.");
	}
}
