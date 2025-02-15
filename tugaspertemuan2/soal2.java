package tugaspertemuan2;

import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        System.out.println("\nSoal 2 \n");
        int Tabungan = 0;
        boolean Pasangan = false;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah Tabungan anda : ");
        Tabungan = input.nextInt();
        System.out.print("Status kepemilikan pasangan : ");
        Pasangan = input.nextBoolean();

        System.out.println("\nStatus kesiapan Tabungan (Tabungan > 100 Juta) : " + (Tabungan > 100000000));
        System.out.println("Status kesiapan Pasangan (calonPasangan == true) : " + (Pasangan));
        
        System.out.println("\nStatus kesiapan Pernikahan (Tabungan > 100 Juta) && (calonPasangan == true) : "
                + ((Tabungan > 100000000) && Pasangan));
    }
}
