package Java2025;

class Person {
} // Person 클래스

class Student extends Person {
} // Student 클래스

class Researcher extends Person {
} // Researcher 클래스

class Professor extends Researcher {
} // Professor

public class InstanceOfEx {
	static void print(Person p) {
		// p가 Person 타입이라면 "Person"을 출력
		if (p instanceof Person)
			System.out.print("Person ");
		// p가 Student 타입이라면 "Student"를 출력
		if (p instanceof Student)
			System.out.print("Student ");
		// p가 Researcher 타입이라면 "Researcher"를 출력
		if (p instanceof Researcher)
			System.out.print("Researcher ");
		// p가 Professor 타입이라면 "Professor"를 출력
		if (p instanceof Professor)
			System.out.print("Professor ");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.print("new Student() ->\t");
		print(new Student()); // new Student() 객체를 생성하여 print 메서드 호출

		System.out.print("new Researcher() ->\t");
		print(new Researcher()); // new Researcher() 객체를 생성하여 print 메서드 호출

		System.out.print("new Professor() ->\t");
		print(new Professor()); // new Professor() 객체를 생성하여 print 메서드 호출
	}
}
