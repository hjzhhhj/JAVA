package Java2025;

public class Goodcalc extends Calculator {

	public int add(int a, int b) { // 추상메소드구현
		return a + b;
	}

	public int subtract(int a, int b) { // 추상메소드구현
		return a - b;
	}

	public double average(int[] a) { // 추상메소드구현
		double sum = 0;
		for (int i = 0; i < a.length; i++)
			sum += a[i];
		return sum / a.length;
	}

	public static void main(String[] args) {
		Goodcalc c = new Goodcalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] { 2, 3, 4 }));
	}
}
