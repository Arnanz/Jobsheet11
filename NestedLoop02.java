import java.util.Scanner;

public class NestedLoop02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] temps = new double[5][7];

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            System.out.println();
            for (int j = 0; j < temps[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                temps[i][j] = input.nextDouble();
            }
            System.out.println();
        }

        for (int i = 0; i < temps.length; i++) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            double total = 0;
            for (double temp : temps[i]) {
                System.out.print(temp + " ");
                total += temp;
            }
            double average = total / temps[i].length;
            System.out.println();
            System.out.println("Rata-rata suhu kota ke-" + (i + 1) + ": " + average);
            System.out.println();
        }
    }
}