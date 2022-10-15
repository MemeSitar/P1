import java.util.Scanner;

public class Vsota1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// preberemo vhodni stevili
		int prvo = sc.nextInt();
		int drugo = sc.nextInt();

		int vsota = prvo + drugo;

		System.out.println(vsota);
	}
}

