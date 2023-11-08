import java.util.Scanner;

public class TugasTambahan02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input jumlah baris
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();
        // input jumlah kolom
        System.out.print("Masukkan jumlah kolom: ");
        int kolom = input.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        input.close();
    }
}