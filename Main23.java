import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main23 {
    private static List<Rekening23> rekenings = new ArrayList<>();
    private static List<Transaksi23> transaksis = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        rekenings.add(new Rekening23("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu"));
        rekenings.add(new Rekening23("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org"));
        rekenings.add(new Rekening23("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com"));

        transaksis.add(new Transaksi23("16030927 3084", 898214, 494048, 3587, "2021-03-09 07:54:42"));
        transaksis.add(new Transaksi23("16100617 0573", 205420, 200162, 775880, "2021-06-25 10:23:00"));
        transaksis.add(new Transaksi23("16971204 2416", 770592, 334245, 444267, "2020-08-11 13:36:56"));


        boolean exit = false;
        while (!exit) {
            System.out.println("\nPilih aksi:");
            System.out.println("1. Tampilkan data rekening");
            System.out.println("2. Tampilkan data transaksi");
            System.out.println("3. Cari saldo > 500000");
            System.out.println("4. Urutkan berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayRekenings();
                    break;
                case 2:
                    displayTransaksis();
                    break;
                case 3:
                    searchSaldoGreaterThan(500000);
                    break;
                case 4:
                    sortRekeningsByName();
                    displayRekenings();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    break;
            }
        }
        scanner.close();
    }

    public static void displayRekenings() {
        System.out.println("\nData Rekening:");
        for (Rekening23 rekening : rekenings) {
            System.out.println(rekening);
        }
    }

    public static void displayTransaksis() {
        System.out.println("\nData Transaksi:");
        for (Transaksi23 transaksi : transaksis) {
            System.out.println(transaksi);
        }
    }

    public static void searchSaldoGreaterThan(double amount) {
        System.out.println("\nSaldo > " + amount + ":");
        for (Transaksi23 transaksi : transaksis) {
            if (transaksi.getSaldo() > amount) {
                System.out.println(transaksi);
            }
        }
    }

    public static void sortRekeningsByName() {
        Collections.sort(rekenings, Comparator.comparing(Rekening23::getNama));
    }
}
