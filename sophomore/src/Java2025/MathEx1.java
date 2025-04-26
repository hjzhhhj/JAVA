package Java2025;

public class MathEx1 {
	public static void main(String[] args) {
		double a = 3.14;
		System.out.println(Math.PI); // 원주율상수출력
		System.out.println(Math.ceil(a)); // ceil(올림)
		System.out.println(Math.floor(a)); // floor(내림)
		System.out.println(Math.sqrt(9)); // 제곱근
		System.out.println(Math.exp(2)); // e의2승
		System.out.println(Math.round(3.14)); // 반올림
		// [1, 45] 사이의정수형난수5개발생
		System.out.print("이번주행운의번호는");
		for (int i = 0; i < 5; i++)
			System.out.print((int) (Math.random() * 45 + 1) + " ");
	}
}