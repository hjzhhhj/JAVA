package Java2025;

class Person5 {
	String name;
	protected String address;
}

class Student5 extends Person5 {
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
}

public class LHG_1 {
	public static void main(String args[]) {
		Student5 s = new Student5();
		s.setName("홍길동");
		s.setAddress("서울시 관악구 신림동 1번지");
		
		System.out.print(s.getName()+"은 "+ s.getAddress()+"에 살고 있음.");
	}
}
