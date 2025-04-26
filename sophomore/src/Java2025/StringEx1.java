package Java2025;

public class StringEx1 {
	public static void main(String[] args) {
		String a = new String(" C#");
		String b = new String(",C++ ");
		System.out.println(a + "의길이는" + a.length()); // 문자열의길이(문자개수)
		System.out.println(a.contains("#")); // 문자열의포함관계
		a = a.concat(b); // 문자열연결
		System.out.println(a);
		a = a.trim(); // 문자열앞뒤의공백제거
		System.out.println(a);
		a = a.replace("C#", "Java"); // 문자열대치
		System.out.println(a);
		String s[] = a.split(","); // 문자열분리
		for (int i = 0; i < s.length; i++)
			System.out.println("분리된문자열" + i + ": " + s[i]);
		a = a.substring(5); // 인덱스5부터끝까지서브스트링리턴
		System.out.println(a);
		char c = a.charAt(2); // 인덱스2의문자리턴
		System.out.println(c);
	}
}