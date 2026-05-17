import java.util.ArrayList;
import java.util.List;

public class Transaksi {
    // Encapsulation: Menyembunyikan data transaksi agar tidak dimodifikasi sembarangan
    private String idTransaksi;
    private List<Menu> listBelanjaan;
    private double totalOmset;

    public Transaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
        this.listBelanjaan = new ArrayList<>();
        this.totalOmset = 0;
    }

    // Menggunakan konsep Polymorphism: Menerima objek apa saja turunan dari kelas Menu
    public void tambahItem(Menu item) {
        listBelanjaan.add(item);
        hitungTotalOmset();
    }

    private void hitungTotalOmset() {
        totalOmset = 0;
        for (Menu item : listBelanjaan) {
            totalOmset += item.hitungSubtotal(); // Polimorfisme memanggil hitungSubtotal() masing-masing kelas anak
        }
    }

    // Getter agar data bisa dibaca secara aman oleh kelas Pembayaran
    public String getIdTransaksi() {
        return idTransaksi;
    }

    public List<Menu> getListBelanjaan() {
        return listBelanjaan;
    }

    public double getTotalHargaSemua() {
    return this.totalOmset;
}

    // DATA YANG MASUK KE BOS
    public void kirimLaporanKeBos() {
        System.out.println("\n=======================================");
        System.out.println("   [LAPORAN MASUK] NOTIFIKASI BOS");
        System.out.println("=======================================");
        System.out.println("ID Transaksi    : " + this.idTransaksi);
        System.out.println("Total Omset     : Rp " + this.totalOmset);
        System.out.println("Detail Item Terjual: ");
        
        for (Menu item : listBelanjaan) {
            // Mengambil tipe spesifik menggunakan instance pembeda (Enkapsulasi/Polimorfisme)
            String jenis = (item instanceof Makanan) ? "Makanan" : "Minuman";
            System.out.println(" - [" + jenis + "] ID: " + item.getIdMenu() + " | Qty: " + item.getMenuJumlah());
        }
        System.out.println("=======================================\n");
    }
}