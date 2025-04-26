package Java2025;

public class WrapperEx1 {
	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A')); // 'A'를소문자로변환
		char c1 = '4', c2 = 'F';
		if (Character.isDigit(c1)) // 문자c1이숫자이면true
			System.out.println(c1 + "는숫자");
		if (Character.isAlphabetic(c2)) // 문자c2가영문자이면true
			System.out.println(c2 + "는영문자");
		System.out.println(Integer.parseInt("-123")); // "-123"을10진수로변환
		System.out.println(Integer.toHexString(28)); // 정수28을16진수문자열로변환
		System.out.println(Integer.toBinaryString(28)); // 28을2진수문자열로변환
		System.out.println(Integer.bitCount(28)); // 28에대한2진수의1의개수
		Double d = Double.valueOf(3.14);
		System.out.println(d.toString()); // Double을문자열"3.14"로변환
		System.out.println(Double.parseDouble("3.14")); // 문자열을실수3.14로변환
		boolean b = (4 > 3); // b는true
		System.out.println(Boolean.toString(b)); // true를문자열"true"로변환
		System.out.println(Boolean.parseBoolean("false")); // 문자열을false로변환
	}
}