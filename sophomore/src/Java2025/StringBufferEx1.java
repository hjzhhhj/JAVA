package Java2025;

public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		sb.append(" is pencil"); // 문자열덧붙이기
		System.out.println(sb);
		sb.insert(7, " my"); // "my" 문자열삽입
		System.out.println(sb);
		sb.replace(8, 10, "your"); // "my"를"your"로변경
		System.out.println(sb);
		sb.delete(8, 13); // "your " 삭제
		System.out.println(sb);
		sb.setLength(4); // 스트링버퍼내문자열길이수정
		System.out.println(sb);
	}
}