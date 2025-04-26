package Java2025;

class Point{
	 private int x, y; // 한 점을 구성하는 x, y 좌표
	 public Point() {
		 this.x = this.y = 0;
	 }
	 public Point(int x, int y) {
		 this.x = x; this.y = y;
	 }
	 public void showPoint() { // 점의 좌표 출력 메서드
		 System.out.println("("+x+","+y+")");
	 }
}

class ColorPoint extends Point {
	private String color; // 점의 색

	public ColorPoint(int x, int y, String color) {
		super(x, y); // Point의 생성자 Point(x, y) 호출
		this.color = color;
	}

	public void showColorPoint() { // 컬러 점의 좌표 출력 메서드
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint 메서드 호출
	}
}

public class SuperEx {
	public static void main(String args[]) {
		ColorPoint cp = new ColorPoint(5, 6, "blue"); // ColorPoint 객체 생성. 5, 6, blue를 받음
		cp.showColorPoint(); // 색깔, 좌표 출력.
	}
}
