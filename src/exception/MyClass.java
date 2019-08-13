package exception;

import java.io.IOException;

public class MyClass {
	public void dangerMethod() throws MyException {//IOException을 던질 가능성ㅇ이 있다는걸 알려준다.
		System.out.println("normal state1");
		boolean isDanger = true;
		if(isDanger)
		//여기서 예외 상황 발생
		throw new MyException("My Exception발생");//에러를 전해준다.
		else
			System.out.println("normal state2");//1)여기까지 코드 안내려간다는 에러
	}
}
