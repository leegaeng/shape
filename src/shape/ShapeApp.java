package shape;

public class ShapeApp {

	public static void main(String[] args) {

		Point p1 = new Point();
		p1.setX(2);
		p1.setY(5);

		Point p2 = new Point();
		p2.setX(10);
		p2.setY(23);

		Point p3 = new Point(50, 50);
		p3.visible(true);
		p3.visible(false);

		/*
		 * ColorPoint p4 = new ColorPoint(); p4.setX(10); p4.setY(50);
		 * p4.setColor("red"); p4.show();
		 */

		ColorPoint p4 = new ColorPoint(10, 50, "red");

		Shape rect = new Rect();
		Shape circle = new Circle();

		/*
		 * rect.draw(); circle.draw();
		 */

		Drawable drawable = new Point(10, 20);
		drawable.draw();

		Circle c = new Circle();
		System.out.println(c instanceof Circle);
		System.out.println(c instanceof Shape);
		System.out.println(c instanceof Drawable);
		// System.out.println(c instanceof Rect); 상속관게가 아니므로 에러가 남

		Shape s = c;
		System.out.println(s instanceof Rect); // circle를 shape로 캐스팅해준 후 비교가능
												// false

	}

}
