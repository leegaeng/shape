package sds.icto55.oop.example.inheritance;

public class Shape {

	private String color;

	public Shape(){};
	
	public Shape(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void calculateArea() {
		System.out.println("넓이를 계산합니다.");
	};
}
