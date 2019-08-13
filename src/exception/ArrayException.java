package exception;

public class ArrayException {
	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		for(int i = 0 ;i <=5;++i) {//로직에러는 내가 반드시 잡아야 한다.
			System.out.print(a[i]+" ");//ArrayIndexOutOfBoundsException
		}
		
	}

}
