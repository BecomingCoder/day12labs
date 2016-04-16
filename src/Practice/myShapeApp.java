package Practice;

import java.util.ArrayList;

public class myShapeApp {

	public static void main(String[] args) {
		
		ArrayList<Shape> myShapes = new ArrayList<>();
		
		myShapes.add(new Circle());
		myShapes.add(new Triangle());
		
		for (Shape p : myShapes)
			p.Draw();


	}

}
