package sds.icto55.oop.example.polymorphism;

public class Shape implements Visible{

	/**
	 * 다형성은 같은 형태를 다양하게 활용할 수 있다는 특징을 일컫는다.
	 * 오버로딩, 오버라이딩이 그 대표적인 예로, 
	 * 
	 * 오버로딩의 경우 
	 * 한클래스 내에서 같은 이름의 메소드를 여러 매개변수로 활용할 수 있음을 일컫으며, 
	 * draw()와 draw(String color)가 바로 그 예다.
	 * 
	 * 오버라이딩의 경우
	 * 상속받은 메소드를 다양하게 변경시킬 수 있음을 뜻하며,
	 * visible 메소드가 그 대표적인 예이다. visible은 Shape 인터페이스로부터 
	 * 상속받았지만 그 안의 내용을 자유롭게 변경시킬 수 있다.
	 * 
	 * 
	 * **/
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void draw() {
		System.out.println("도형을 그렸습니다");
	}
	
	public void draw(String color) {
		System.out.println("색이"+ color+ "인 도형을 그렸습니다");
	}
	
	
	public void visible(boolean flag) {
		if (flag == true) {
			draw();
		} else {
			System.out.println("도형을 지웠습니다.");
		}
	}

	
}
