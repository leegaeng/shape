public class ShapeApp {

	public static void main(String[] args) {

		Point p1 = new Point();
		p1.setX(2);
		p1.setY(5);

		p1.show();

		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);
		p2.show();

		Point p3 = new Point(50, 50);
		p3.show(true);
		p3.show(false);

		/*
		 * ColorPoint p4 = new ColorPoint(); p4.setX(10); p4.setY(50);
		 * p4.setColor("red"); p4.show();
		 */

		ColorPoint p4 = new ColorPoint(10, 50, "red");

		Shape rect = new Rect();
		Shape circle = new Circle();

		rect.draw();
		circle.draw();

	}

}
