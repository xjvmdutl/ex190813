package Kr.co.itcen.paint.Point;

public class ColorPoint extends Point {
	private String color;
	public ColorPoint(int x,int y, String color) {
		//setX(x);
		//setY(y);
		super(x,y);
		this.color=color;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	@Override 
	public void show() {
		//super.show();//부분 재구현
		System.out.println("점[x="+getX()+", y="+getY()+", Color="+color+"]를 그렸습니다.");
	}
}
