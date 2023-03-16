import java.util.Scanner;

public class Luas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;
        double luas = 0;
        System.out.println("Program Menghitung Luas Bidang  Datar");
        System.out.println("-------------------------------------");
        System.out.println("1.Lingkaran");
        System.out.println("2.Persegi Panjang");
        System.out.print("Pilih Bidang datar (1 atau 2): ");
        pilih = input.nextInt();

        switch (pilih) {
            case 1:
                double r;
                System.out.print("Masukkan jari-jari lingkaran: ");
                r = input.nextDouble();
                luas = Math.PI * r * r;
                System.out.println("Luas lingkaran adalah: " + luas);
                break;
            case 2:
                double panjang, lebar;
                System.out.print("Masukkan Panjang persegi panjang: ");
                panjang = input.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                lebar = input.nextDouble();
                luas = panjang * lebar;
                System.out.println("Luas persegi panjang adalah: " + luas);
                break;

            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }
    }
}