import java.util.Scanner;

public class TP03 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("");
		int D = input.nextInt();

		System.out.print("");
		int R = input.nextInt();

		System.out.print("");
		int I = input.nextInt();

		if (D > R && D > I) {
			System.out.println("Dira");
		} else if (R > D && R > I) {
			System.out.println("Radi");
		} else {
			System.out.println("Idar");

		}
	}
}
