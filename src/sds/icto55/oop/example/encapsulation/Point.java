package sds.icto55.oop.example.encapsulation;

public class Point  {

	
	/**public 접근제어자가 붙은 경우는 다른 패키지에서도 접근이 가능하나 private 접근 제어자가
	 * 붙은 경우, 해당객체외에는 직접적인 접근과 수정이 불가능하다.
	 * 이를 캡슐화라고 하는데, 다른 사용자에 의해 변경될 가능성이 있는 중요한 정보들을
	 * 접근하지 못하게 막는 장점이 있다. 
	 * 
	 * 이에 직접적인 접근은 불가하지만, 다른 public 메소드를 통해 간접적으로 접근 가능하다.
	 * Point 객체의 경우 직접적으로 x,y좌표를 변경하지 못하지만
	 * getter/setter 메소드를 통해 간접적으로 접근할 수 있다. 
	 * 
	 * **/
	
	private int x;
	private int y;

	public Point() {
	};

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void draw() {
		System.out.println("좌표[x=" + x + ", y=" + y + "] 에 점을 그렸습니다.");
	}

	

}
