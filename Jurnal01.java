import java.util.Scanner;

public class Jurnal01 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("");
		char karakter = input.next().charAt(0);
		if (karakter == 'b' || karakter == 'c' || karakter == 'd' || karakter == 'f' || karakter == 'g'
				|| karakter == 'h' || karakter == 'j' || karakter == 'k' || karakter == 'l' || karakter == 'm'
				|| karakter == 'n' || karakter == 'p' || karakter == 'q' || karakter == 'r' || karakter == 's'
				|| karakter == 't' || karakter == 'v' || karakter == 'w' || karakter == 'x' || karakter == 'y'
				|| karakter == 'z') {
			System.out.println(karakter + " merupakan huruf konsonan");
		} else if (karakter == 'a' || karakter == 'i' || karakter == 'u' || karakter == 'e' || karakter == 'o') {
			System.out.println(karakter + " merupakan huruf vokal");
		} else {
			System.out.println("Karakter yang diinput bukan huruf konsonan atau huruf vokal");
		}
	}
}
