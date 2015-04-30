package shape;
public class ColorPoint extends Point {

	private String color;

	public ColorPoint() {
		System.out.println("칼라포인트~");
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void show() {
		System.out.println("좌표[x=" + getX() + ", y=" + getY() + ", color="
				+ color + "] 에 점을 그렸습니다.");
	}

}
