package test.board;

/*
 * 질의 응답 관련 시스템 
 */
public class QABoard extends Board{
	private boolean replyState;//답변여부 
	public QABoard() {}
	public QABoard(int bno, String subject, String writer, String content, boolean replyState) {
		super(bno, subject, writer, content);
		this.replyState = replyState;
	}
	public boolean isReplyState () {
		return replyState;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getSimpleName());
		builder.append("[");
		builder.append("replyState=");
		builder.append(replyState);
		builder.append("]");
		return builder.toString();
	}
	
}
