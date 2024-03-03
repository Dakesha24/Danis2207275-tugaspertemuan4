/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2207275_daniskeysarasaputra_tugaspbo4;

/**
 *
 * Nama : Danis Keysara Saputra
 * NIM  : 2207275
 * 
 * SOAL 3
 * Buatlah algoritma dalam bahasa Java, menghitung n!, dimana n>=0, 0!=1, dengan
tampilan sebagai berikut, jika diinput n=5, maka keluarannya harus 5!=5*4*3*2*1=120
 * 
 */
import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        int faktorial = 1;
        for (int i = 1; i <= n; i++) {
            faktorial *= i;
        }

        System.out.println(n + "! = " + faktorial);
    }
}

