import java.util.Scanner;
public class Main {

	static boolean Hansu(int a) {
		boolean result = true;
		int b, c, d, e;

		if (a <= 99) {
			return result;
		}

		if (a >= 1000) {
			b = a / 1000;
			a = a % 1000;
			c = a / 100;
			a = a % 100;
			d = a / 10;
			a = a % 10;
			if ((b - c) != (c - d) || (c - d) != (d - a))
				result = false;
		}
		if (a >= 100) {
			c = a / 100;
			a = a % 100;
			d = a / 10;
			a = a % 10;
			if ((c - d) != (d - a))
				result = false;
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int result = 0;

		for (int i = 1; i <= num; i++) {
			if (Hansu(i)) {
				result++;
			}
		}

		System.out.print(result);
	}
}
