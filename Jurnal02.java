import java.util.Scanner;

public class Jurnal02 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);

		// Membaca input penghasilan
		System.out.print("");
		double penghasilan = input.nextDouble();

		// Menghitung besaran pajak
		double pajak;
		if (penghasilan <= 50) {
			pajak = penghasilan * 0.05;
		} else if (penghasilan <= 250) {
			pajak = 2.5 + (penghasilan - 50) * 0.15;
		} else if (penghasilan <= 500) {
			pajak = 32.5 + (penghasilan - 250) * 0.25;
		} else {
			pajak = 82.5 + (penghasilan - 500) * 0.30;
		}

		System.out.println("Penghasilan kotor = " + penghasilan + " juta Rupiah");
		System.out.println("Pajak " + (int) (pajak / penghasilan * 100) + "% = Rp. " + pajak * 1000000);
		System.out.println("Penghasilan bersih = Rp. " + (penghasilan - pajak) * 1000000);
	}
}
