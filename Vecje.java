import java.util.Scanner;

public class Vecje {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int prvo = sc.nextInt();
		int drugo = sc.nextInt();

		if (prvo > drugo) {
			System.out.println("Prvo je vecje.");
		} else {
			if (prvo < drugo) {
				System.out.println("Drugo je vecje.");
			} else {
				System.out.println("Stevili sta enaki");
			}
		}
	}
}
