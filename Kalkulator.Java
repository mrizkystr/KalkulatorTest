import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Selamat datang di Kalkulator Sederhana");
        
        while (true) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();
            
            if (pilihan == 5) {
                System.out.println("Terima kasih telah menggunakan kalkulator ini!");
                break;
            }
            
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();
            
            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();
            
            switch (pilihan) {
                case 1:
                    System.out.println("Hasil: " + (angka1 + angka2));
                    break;
                case 2:
                    System.out.println("Hasil: " + (angka1 - angka2));
                    break;
                case 3:
                    System.out.println("Hasil: " + (angka1 * angka2));
                    break;
                case 4:
                    if (angka2 != 0) {
                        System.out.println("Hasil: " + (angka1 / angka2));
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}
