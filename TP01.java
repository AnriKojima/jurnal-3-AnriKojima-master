import java.util.Scanner;

public class TP01 {

	public static void main(final String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("");
		int P = input.nextInt();
		System.out.print("");
		int A = input.nextInt();
		System.out.print("");
		int B = input.nextInt();

		double NA = 0.25 * P + 0.35 * A + 0.40 * B;

		String status;

		if (NA >= 80.01 && NA <= 100) {
			status = "Lulus Matakuliah Implementasi Algoritma dengan nilai A.";
		} else if (NA >= 70.01 && NA <= 80.00) {
			status = "Lulus Matakuliah Iplementasi Algoritma dengan nilai B.";
		} else if (NA >= 60.01 && NA <= 70.00) {
			status = "Lulus Matakuliah Implementasi Algoritma dengan nilai C.";
		} else {
			status = "Tidak Lulus Matakuliah Implementasi Algoritma. Silahkan mengulang tahun depan.";

		}
		System.out.printf("Nilai Akhihr: %.2f\n", NA);
		System.out.println(status);

		if (status.equals("TIdak Lulus Matakuliah Implementasi Algoritma.")) {
			System.out.println("Silahkan mengulang tahun depan.");

		}
	}
}
