import java.util.ArrayList;
import java.util.List;

public class Transaksi {
    private String idTransaksi;
    private List<itemTransaksi> listBelanjaan;
    private double totalOmset;

    public Transaksi(String idTransaksi) {
        this.idTransaksi = idTransaksi;
        this.listBelanjaan = new ArrayList<>();
        this.totalOmset = 0;
    }

    // Sesuai Request: Metode addItem langsung menerima objek Menu dan qty
    public void addItem(Menu menu, int qty) {
        // Di sini Transaksi secara otomatis membuat objek itemTransaksi baru
        itemTransaksi itemBaru = new itemTransaksi(menu, qty);
        listBelanjaan.add(itemBaru);
        
        // Update total omset keseluruhan transaksi
        hitungTotalOmset();
    }

    private void hitungTotalOmset() {
        totalOmset = 0;
        for (itemTransaksi item : listBelanjaan) {
            totalOmset += item.getSubtotal(); // Tinggal panggil getter subtotal
        }
    }

    // Getter untuk digunakan oleh kelas Pembayaran atau Main
    public String getIdTransaksi() { return idTransaksi; }
    public List<itemTransaksi> getListBelanjaan() { return listBelanjaan; }
    public double getTotalOmset() { return totalOmset; }
}