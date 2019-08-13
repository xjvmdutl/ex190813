package exception;

public class MyException extends Exception {
	private static final long serialVersionUID = -1;
	public MyException() {
		super("my Exception 발생");
	}
	public MyException(String message) {
		super(message);
	}
}
