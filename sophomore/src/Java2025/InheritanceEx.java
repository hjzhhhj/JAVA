package Java2025;

class Person {
	private int weight; // 무게 선언
	int age; // 나이 선언
	protected int height; // 키 선언
	public String name; // 이름 선언
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return weight;
	}
}

class Student extends Person{
	public void set() {
		age = 30;
		name = "홍길동";
		height = 175;
		// weight = 99; // private로 인해 접근 불가!
		setWeight(99); // Person의 setWeight 메서드를 호출해서 99를 받음.
	}
}

public class InheritanceEx {
	public static void main(String args[]) {
		Student s = new Student(); // Student 객체 생성
		s.set(); // Student의 set 메서드 호출
	}
}
