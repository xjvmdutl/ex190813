package Kr.co.itcen.paint.main;

import Kr.co.itcen.paint.i.Drawable;

public class GraphicText implements Drawable{
	private String text;
	public GraphicText(String text) {
		this.text=text;
	}
	@Override 
	public void draw() {
		System.out.println("\""+text+"\"를 그렸습니다");
	}
}
