package sds.icto55.oop.example.inheritance;

public class Circle extends Shape {

	/**Circle 객체는 Shape 객체를 상속받았다. 그러므로, 부모 객체의 속성 뿐만 아니라
	  메소드까지 포함할 뿐만 아니라 이를 확장하여 새로운 속성과 메소드를 정의할 수 있다.**/
	
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		System.out.println("넓이를 계산합니다. : " + (double) radius * radius * Math.PI);
	};
	
	public void drawArea() {
		System.out.println("원을 그립니다.");
	};
	
	
}
