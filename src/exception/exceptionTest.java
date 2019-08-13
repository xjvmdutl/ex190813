package exception;

public class exceptionTest {
	public static void main(String[] args) {
		try {//
			int a = 0;
			System.out.println("some codes ... 1");//코드존재
			int k = 100000/a;//0으로 나누는것 예외발생
			System.out.println("some codes ... 2");//코드존재
			System.out.println("some codes ... 3");//코드존재
		}catch(ArithmeticException ex) {//보통 부모클래스(Exception)으로 예외처리 한다	
										//보통 catch문에서 예외가 발생시 프로그램을 종료해야한다
			//catch문을 비워놨을 경우 예외가 발생한건지 안한건지 모른다
			//1.로그 남기기(반드시 파일)
			System.out.println("error : " +ex);
			//2.사과하기
			System.out.println("죄송 합니다. 예기치 /.....");//웹일 경우 페이지로 이동
			//3.정상 종료(자원 정리)
			return;
			//4.이거라도안되면 최소한 해야하는 코드
			//ex.printStackTrace();//스택을 상태를 보여준다.
		}finally {
			System.out.println("자원 정리");//프로그램이 정상적으로 동작하거나, 예외처리가 되더라도 반드시 실행되는 코드
			//따라서 자원정리는 여기서 실행
		}

	}

}
