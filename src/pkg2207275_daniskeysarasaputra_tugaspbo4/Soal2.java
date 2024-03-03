package pkg2207275_daniskeysarasaputra_tugaspbo4;

/**
 *
 * Danis Keysara Saputra (2207275)
 * 
 * Soal 2
 * Buatlah algoritma dalam bahasa Java, menampilkan banyaknya bilangan ganjil dari
batasAwal dan batasAkhir yang diinput dari alat masukan.
 */
import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int batasAwal, batasAkhir, jumlahGanjil, i;

        // Input batasAwal dan batasAkhir
        System.out.print("Masukkan batas awal: ");
        batasAwal = input.nextInt();
        System.out.print("Masukkan batas akhir: ");
        batasAkhir = input.nextInt();

        // Perulangan dari batasAwal hingga batasAkhir
        jumlahGanjil = 0;
        System.out.print("Bilangan ganjil: ");
        for (i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 == 1) {
                jumlahGanjil++;
                System.out.print(i + " ");
            }
        }

        // Tampilkan jumlah bilangan ganjil
        System.out.println("\nJumlah bilangan ganjil: " + jumlahGanjil);
    }
}
