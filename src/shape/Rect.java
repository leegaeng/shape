package shape;

public class Rect extends Shape implements Drawable {

	private int width;
	private int height;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void draw() {
		System.out.println("가로가 " + width + ", 세로가 " + height + "인 사각형을 그렸습니다");
	}

	@Override
	public double calculateArea() {
		return (double) width * height;
	}

	@Override
	public void visible(boolean flag) {
		if (flag == true) {
			draw();
		} else {
			System.out.println("가로가 " + width + ", 세로가 " + height
					+ "인 사각형을 지웠습니다");
		}
	}
}
