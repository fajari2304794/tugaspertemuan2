package tugaspertemuan2;

import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        System.out.println("Soal 1 \n");
        float Bilangan1 = 0;
        float Bilangan2 = 0;
        float Bilangan3 = 0;

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan Bilangan desimal negatif ke-1 : ");
            Bilangan1 = input.nextFloat();
            System.out.print("Masukkan Bilangan desimal negatif ke-2 : ");
            Bilangan2 = input.nextFloat();
            System.out.print("Masukkan Bilangan desimal negatif ke-3 : ");
            Bilangan3 = input.nextFloat();
        } catch (Exception e) {
            System.out.println("tolong masukkan angka. error : " + e);
        }

        System.out.println(
                Bilangan1 + " + " + Bilangan2 + " + " + Bilangan3 + " = " + (Bilangan1 + Bilangan2 + Bilangan3));

        System.out.println(
                Bilangan1 + " - " + Bilangan2 + " - " + Bilangan3 + " = " + (Bilangan1 - Bilangan2 - Bilangan3));

        System.out.println(
                Bilangan1 + " * " + Bilangan2 + " * " + Bilangan3 + " = " + (Bilangan1 * Bilangan2 * Bilangan3));
                
        System.out.println(
                Bilangan1 + " / " + Bilangan2 + " / " + Bilangan3 + " = " + (Bilangan1 / Bilangan2 / Bilangan3));
    }
}
