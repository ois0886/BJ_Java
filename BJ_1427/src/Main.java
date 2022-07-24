import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		long num = Long.parseLong(number);
		long temp = num;
		int kkk = 0;
		while (true) {
			temp = temp / 10;
			kkk += 1;
			if (temp == 0)
				break;
		}
		int arr[] = new int [kkk];
		for(int i=0; i<kkk; i++) {
			arr[i]= (int) (num%10);
			num/=10;
		}
		Arrays.sort(arr);
		for(int i=kkk-1; i>=0; i--) {
			System.out.print(arr[i]);
		}
		sc.close();

	}

}