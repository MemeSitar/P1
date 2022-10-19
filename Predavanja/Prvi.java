import java.util.Scanner;

public class Prvi {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("hello");
		System.out.print("please insert your age: ");
		int a = sc.nextInt();
		int b = 2022 - a;
		System.out.println("you were born in " + b);		
	}
}
