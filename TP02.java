import java.util.Scanner;

public class TP02 {

	public static void main(final String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("");
		int N = input.nextInt();

		if (N % 6 == 0) {
			System.out.println("Kelipatan enam");
		} else {
			System.out.println("Bukan kelipatan enam");
		}
	}
}
