package Java2025;

class Point {
	private int x, y; // x, y를 선언합니다.
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() { // 좌표를 출력하는 메서드
		System.out.println("("+x+", "+y+")");
	}
}

class ColorPoint extends Point{ // Point 상속
	private String color; // 색 선언
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { // 컬러 점의 좌표를 출력하는 메서드
		System.out.println(color);
		showPoint(); // Point 클래스의 showPoint 호출
	}
}

public class ColorPointEx {
	public static void main(String args[]) {
		Point p = new Point(); // Point의 p 객체를 생성합니다.
		p.set(1,  2); // Point의 set 메서드를 호출하여 1, 2를 받습니다.
		p.showPoint(); // Point의 showPoint 메서드를 호출하여 좌표를 출력합니다.
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4); // Point의 set 메서드를 호출합니다.
		cp.setColor("red"); // ColorPoint의 setColor 메서드를 호출하여 red를 받습니다
		cp.showColorPoint(); // 색깔을 출력하고, showPoint 메서드를 호출하여 좌표를 출력합니다.
	}
}
