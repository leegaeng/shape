package shape;

public class Circle extends Shape implements Drawable {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw() {
		System.out.println("반지름이 " + radius + "인 원을 그렸습니다");
	}

	@Override
	public double calculateArea() {
		return (double) radius * radius * Math.PI;
	}

	@Override
	public void visible(boolean flag) {
		if (flag == true) {
			draw();
		} else {
			System.out.println("반지름이 " + radius + "인 원을 지웠습니다.");
		}
	}

}
