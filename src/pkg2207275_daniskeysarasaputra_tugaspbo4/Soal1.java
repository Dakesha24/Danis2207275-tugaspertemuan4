package pkg2207275_daniskeysarasaputra_tugaspbo4;

/**
 *
 * Danis Keysara Saputra (2207275)
 * 
 * Soal 1
 * Buatlah algoritma dalam bahasa Java, menampilkan bilangan dari satu sampai dengan
n, dimana n diinput dari alat masukan, n>=1
 * 
 */
import java.util.Scanner;

public class Soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi variabel
        int n, i;

        // Input nilai n
        System.out.print("Masukkan nilai n: ");
        n = input.nextInt();

        // Periksa nilai n
        if (n < 1) {
            System.out.println("Nilai n harus lebih besar dari atau sama dengan 1");
        } else {
            // Perulangan dari 1 sampai n
            for (i = 1; i <= n; i++) {
                System.out.println(i);
            }
        }
    }
}
