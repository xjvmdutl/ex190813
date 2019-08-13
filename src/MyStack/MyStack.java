package MyStack;

public class MyStack<T> {
	private int top;
	private T[] buffer;//자료형이 정의되어 있기떄문에 자료형마다 매번 class를 만들어야 한다->제네릭 사용
	//자료형을 runtime때 결정한다.
	@SuppressWarnings("unchecked")//알고하는거니 오류내지마라
	public MyStack(int capacity) {
		top = -1;
		//buffer = new T[capacity];//run타임때 결정되니 이러한 코드가 안된다.
		buffer = (T[])new Object[capacity];
	}
	private void resize() {
		@SuppressWarnings("unchecked")
		T[] temp = (T[])new Object[buffer.length*2];
		for(int i=0;i<=top;++i) {//작업이 많아지면 cpu사용량이 많아 진다.
			temp[i]=buffer[i];
		}
		buffer=temp;
	}
	public void push(T data) {
		if(top==buffer.length-1) {//stack is Full
			resize();
		}
		buffer[++top]=data;
	}
	
	public T pop() throws MyStackException{//이게 위험하다는것을 알려주어야 한다//MyStackException예외가 발생할 가능성이 있다.
		if(isEmpty())
			throw new MyStackException("Stack is Empty");
		return buffer[top--];
	}
	public boolean isEmpty() {
		return top==-1;
	}
}