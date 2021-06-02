package ControlStatementProject;

import java.util.Scanner;

public class leapYearCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int bulan, tahun, jumlahHari;
		
		System.out.println("1. Januari		7. Juli");
		System.out.println("2. Februari		8. Agustus");
		System.out.println("3. Maret		9. September");
		System.out.println("4. April		10. Oktober");
		System.out.println("5. Mei			11. November");
		System.out.println("6. Juni			12. Desember");
		
		
		System.out.print("\nMasukkan Bulan (1-12) : ");
		bulan = in.nextInt();
		
		System.out.print("Masukkan Tahun : ");
		tahun = in.nextInt();
		
		String ganjilGenap = bulan % 2 == 1 ? "Ganjil" : "Genap";
		Boolean tahunKabisat = tahun % 4 == 0 || tahun % 400 == 0;
		
		switch (bulan) {
		case 1 :
			jumlahHari = 31;
			break;
		case 2 :
			if (tahunKabisat) {
				jumlahHari = 29;
			} else {
				jumlahHari = 28;
			}
			break;
		case 3 :
			jumlahHari = 31;
			break;
		case 4 :
			jumlahHari = 30;
			break;
		case 5 :
			jumlahHari = 31;
			break;
		case 6 :
			jumlahHari = 30;
			break;
		case 7 :
			jumlahHari = 31;
			break;
		case 8 :
			jumlahHari = 31;
			break;
		case 9 :
			jumlahHari = 30;
			break;
		case 10 :
			jumlahHari = 31;
			break;
		case 11 :
			jumlahHari = 30;
			break;
		case 12 :
			jumlahHari = 31;
			break;
		default :
			jumlahHari = -1;
			break;
		}
		in.close();
		
		if (jumlahHari == -1) {
			System.out.println("Invalid Input");
		} else {
			System.out.println("Bulan : " + bulan + " adalah bulan " + ganjilGenap);
			System.out.println("Jumlah Hari : " + jumlahHari);
			System.out.println("Tahun : " + tahun + (tahunKabisat ? " adalah" : " bukan") + " tahun kabisat");
		}
	}
}
