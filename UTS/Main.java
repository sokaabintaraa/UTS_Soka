import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Inisialisasi Objek Menu menggunakan Polymorphism
        Menu menu1 = new Minuman("110", 1, 12000.00); // 1 Minuman @12000
        Menu menu2 = new Makanan("100", 2, 10000.00); // 2 Makanan @10000

        // 2. Buat objek Transaksi Baru (Data yang nantinya masuk ke Bos)
        // Kita beri ID Transaksi unik, misalnya "TRX-001"
        Transaksi transaksiHariIni = new Transaksi("TRX-001");

        // 3. Masukkan menu yang dibeli pelanggan ke dalam data transaksi
        transaksiHariIni.tambahItem(menu1);
        transaksiHariIni.tambahItem(menu2);

        // 4. Oper data transaksi tersebut ke kelas Pembayaran untuk diproses struknya
        Pembayaran kasir = new Pembayaran(transaksiHariIni);
        
        // Simulasi pembeli membayar dengan uang Rp 50.000
        // Method ini otomatis akan mencetak NOTA/STRUK kalau uangnya cukup
        kasir.prosesPembayaran(50000.00);

        // 5. Terakhir, kirim laporan internal ke layar si Bos
        transaksiHariIni.kirimLaporanKeBos();
    }
}