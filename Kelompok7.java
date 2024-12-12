import java.util.Scanner;

public class Kelompok7{
    static Scanner sc = new Scanner(System.in);
    static String menuKafe[][] = {{"Kopi Hitam", "15000"}, {"Latte", "22000"}, {"Teh Tarik", "12000"}, {"Mie Goreng", "18000"}};
    static String pesanan[][][] = new String[50][50][2];
    static String statusPembayaran[][] = new String[50][2];
    static String namaPelanggan[] = new String[50];
    static int nomorMeja, totalHarga;

    //TAMPIL MENU
    static void tampilMenu(){
        System.out.println("===== MENU KAFE =====");
        for (int i = 0; i < menuKafe.length; i++) {
            System.out.println((i+1) + ". " + menuKafe[i][0] + " - Rp " + menuKafe[i][1]);
        }
        tambahPesanan();
    }

    //TAMBAH PESANAN DAN VALIDASI
    static void tambahPesanan(){
        int i = 0, j = 0, pilihan, jumlah, hargaSementara;

        if (namaPelanggan != null){
            i++;
        }

        System.out.print("Masukkan nama pelanggan : ");
        sc.nextLine();
        namaPelanggan[i] = sc.nextLine();
        System.out.print("Masukkan nomor meja : ");
        nomorMeja = sc.nextInt();

        boolean pesan = true;

        while (pesan){
            System.out.println("Pilih menu (1-4, atau 0 untuk selesai) : ");
            pilihan = sc.nextInt();

            if (pilihan == 1 || pilihan == 2 || pilihan == 3 || pilihan == 4){
                for (int k = 0; k < pesanan[i][j].length; k++) {
                    pesanan[i][j][k] = menuKafe[pilihan - 1][k];
                    System.out.print("Masukkan jumlah item untuk " + pesanan[i][j][0] + " : ");
                    jumlah = sc.nextInt();

                    totalHarga += jumlah * Integer.parseInt(pesanan[i][j][1]);
                }
            } else if (pilihan == 0){
                System.out.println("Pesanan berhasil ditambahkan.");
                System.out.println("Total harga pesanan : Rp " + totalHarga);
                pesan = false;
            }
        }
    }

    //TAMPILKAN DAFTAR PESANAN
    static void tampilPesanan(){

    }

    //PEMBAYARAN PESANAN
    static void pembayaranPesanan(){

    }

    public static void main(String[] args) {
        int menu;

        System.out.println("====== MENU UTAMA ======");
        System.out.println("1. Tambahkan Pesanan");
        System.out.println("2. Tampilkan Daftar Pesanan");
        System.out.println("3. Pembayaran dan Cetak Struk");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu : ");
        menu = sc.nextInt();

        switch (menu){
            case 1:
                tampilMenu();
                break;
            case 2:
                tampilPesanan();
                break;
            case 3:
                pembayaranPesanan();
                break;
            case 4:
                System.out.println("Terima kasih telah berbelanja di kafe kami!");
                break;
        }
    }
}