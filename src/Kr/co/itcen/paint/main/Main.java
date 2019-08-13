package Kr.co.itcen.paint.main;
import Kr.co.itcen.paint.*;
import Kr.co.itcen.paint.i.Drawable;
import Kr.co.itcen.paint.i.Resizable;
import Kr.co.itcen.paint.shape.Rect;
import Kr.co.itcen.paint.shape.Shape;
import Kr.co.itcen.paint.shape.Triangle;

public class Main {
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
	public static void resize(Drawable drawable) {
		if(drawable instanceof Resizable)
			((Resizable)drawable).resize();
	}
	public static void main(String[] args) {
		Shape s1= new Triangle();
		//Down Casting : 명시적(Explicity)
		((Triangle)s1).setX1(10);//명시적 케스팅
		//UP Casting : 암시적(Implecity) 
		Rect rect = new Rect();
		Shape s2= rect;//(Shape)rect
		
	}
}
