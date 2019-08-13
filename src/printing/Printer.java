package printing;

public class Printer<T>{
	public <T> void println(T t) {
		System.out.println(t);
	}
	//가변변수 
	public int sum(int... nums) {//가변타입
		int sum=0;
		for(int i : nums) {
			sum+=i;
		}
		return sum;
	}
	public <T> void println(T...ts) {//가변변수 + 제네릭타입
		for(T t: ts) {
			System.out.print(t+" ");
		}
	}
}
