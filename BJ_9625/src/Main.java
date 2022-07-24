import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int A = 1;
		int B = 0;
		int temp;

		while (num > 0) {
			num--;
			temp = B;
			B = A + B;
			A = temp;
		}
		System.out.println(A + " " + B);
	}
}
