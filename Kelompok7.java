import java.util.Scanner;

public class Kelompok7{
    static Scanner sc = new Scanner(System.in);
    static String menuKafe[][] = {{"Kopi Hitam", "15000"}, {"Latte", "22000"}, {"Teh Tarik", "12000"}, {"Mie Goreng", "18000"}};
    static String statusPembayaran[] = {"Belum bayar", "Sudah bayar"};
    static String namaPelanggan;
    static int nomorMeja, totalHarga;

    //TAMBAH PESANAN DAN VALIDASI
    static void tambahPesanan(){
        
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
                tambahPesanan();
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