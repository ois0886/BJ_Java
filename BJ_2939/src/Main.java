/*
 ����̴� ���� �������忡�� ������ ����ϰ� �ִ�. ����̴� ���� �������Կ� ������ ��Ȯ�ϰ� Nų�α׷��� ����ؾ� �Ѵ�. 
 �������忡�� ����� ������ ������ ����� �ִ�.
  ������ 3ų�α׷� ������ 5ų�α׷� ������ �ִ�.
����̴� ������ ������, �ִ��� ���� ������ ��� ������ �Ѵ�.
 ���� ���, 18ų�α׷� ������ ����ؾ� �� ��, 3ų�α׷� ���� 6���� �������� ������,
 5ų�α׷� 3���� 3ų�α׷� 1���� ����ϸ�, �� ���� ������ ������ ����� �� �ִ�.
����̰� ������ ��Ȯ�ϰ� Nų�α׷� ����ؾ� �� ��, 
���� �� ���� �������� �Ǵ��� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;
public class Main {
	public static void main(String []args) {
		int sugar_3 = 3;
		int sugar_5 = 5;
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int number=0;
		boolean check = false;
		while(input > 0) {
			if(input >= 5) {
				if(input % 5 ==0) {
					input -=5;
					number++;
				}
				else {
					input -=3;
					number++;
				}
			}
			else {
				if(input%3 == 0) {
					input = 0;
					number++;
				}
				else {
					input = -1;
				}
			}
			if(input==0) {
				check = true;
			}
		}
		if(check) {
			System.out.print(number);
		}
		else {
			System.out.print(-1);
		}
		
	}
}
