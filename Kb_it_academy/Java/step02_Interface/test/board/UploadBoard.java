package test.board;

public class UploadBoard extends Board{
	private String fileName;
	
	public UploadBoard() {}

	public UploadBoard(int bno, String subject, String writer, String content) {
		super(bno, subject, writer, content);
		this.fileName = fileName;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(getClass().getSimpleName());
		builder.append("[");
		builder.append("fileName=");
		builder.append(fileName);
		builder.append("]");
		return builder.toString();
	}
}
