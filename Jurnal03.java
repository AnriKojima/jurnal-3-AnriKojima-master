import java.util.Scanner;

public class Jurnal03 {

	public static void main(final String[] args) {
		Scanner in = new Scanner(System.in);
		int D = in.nextInt();
		int R = in.nextInt();
		int I = in.nextInt();
		if (D < R && D < I) {
			System.out.print("Dira, ");
			if (R < I) {
				System.out.print("Radi, Idar");
			} else {
				System.out.print("Idar, Radi");
			}
		} else if (R < D && R < I) {
			System.out.print("Radi, ");
			if (D < I) {
				System.out.print("Dira, Idar");
			} else {
				System.out.print("Idar, Dira");
			}
		} else {
			System.out.print("Idar, ");
			if (D < R) {
				System.out.print("Dira, Radi");
			} else {
				System.out.print("Radi, Dira");
			}
		}
		in.close();
	}
}
