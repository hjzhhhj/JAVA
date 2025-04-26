package Java2025;

public class UsingOverride {
	public static void main(String[] args) {
		Shape start, last, obj;
		start = new Line(); // Line 객체연결
		last = start;
		obj = new Rect();
		last.next = obj; // Rect 객체연결
		last = obj;
		obj = new Line(); // Line 객체연결
		last.next = obj;
		last = obj;
		obj = new Circle(); // Circle 객체연결
		last.next = obj;
		// 모든도형출력
		Shape p = start;
		while (p != null) {
			p.draw();
			p = p.next;
		}
	}
}