package shape;

public class Triangle extends Shape implements Drawable {

	private int height;
	private int width;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public double calculateArea() {
		return (height * width) / 2;
	}

	@Override
	public void draw() {
		System.out.println("가로가 " + width + ", 높이가 " + height + "인 삼각형을 그렸습니다");
	}

	@Override
	public void visible(boolean flag) {
		if (flag == true) {
			draw();
		} else {
			System.out.println("가로가 " + width + ", 높이가 " + height
					+ "인 삼각형을 지웠습니다");

		}
	}
}
