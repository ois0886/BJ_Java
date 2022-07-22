import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
     
     int A,B,V;
     int result;
     
     A = sc.nextInt();
     B = sc.nextInt();
     V = sc.nextInt();
     
     result = (V-B-1) / (A-B);
     
     System.out.println(result+1);

     sc.close();
	}
}