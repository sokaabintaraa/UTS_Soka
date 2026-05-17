public class Pembayaran {
    // Encapsulation: Melindungi data pembayaran pelanggan
    private Transaksi dataTransaksi;
    private double uangDibayar;
    private double uangKembalian;

    public Pembayaran(Transaksi dataTransaksi) {
        this.dataTransaksi = dataTransaksi;
    }

    // Proses hitung pembayaran dan kembalian
    public void prosesPembayaran(double uangDibayar) {
        this.uangDibayar = uangDibayar;
        double totalTagihan = dataTransaksi.getTotalHargaSemua(); 

        if (uangDibayar >= totalTagihan) {
            this.uangKembalian = uangDibayar - totalTagihan;
            cetakStrukPelanggan();
        } else {
            System.out.println("[⚠️ ERROR] Uang yang dibayarkan kurang sebesar: Rp " + (totalTagihan - uangDibayar));
        }
    }

    // NOTA / STRUK UNTUK PELANGGAN
    private void cetakStrukPelanggan() {
        System.out.println("---------------------------------------");
        System.out.println("             NOTA / STRUK              ");
        System.out.println("---------------------------------------");
        System.out.println("ID Transaksi : " + dataTransaksi.getIdTransaksi());
        System.out.println("---------------------------------------");
        
        // Polimorfisme memanggil display() milik Makanan atau Minuman secara otomatis
        for (Menu item : dataTransaksi.getListBelanjaan()) {
            item.display();
            System.out.println("Subtotal     : Rp " + item.hitungSubtotal());
            System.out.println("---------------------------------------");
        }

        System.out.println("Total Tagihan: Rp " + dataTransaksi.getTotalHargaSemua());
        System.out.println("Uang Tunai   : Rp " + this.uangDibayar);
        System.out.println("Kembalian    : Rp " + this.uangKembalian);
        System.out.println("---------------------------------------");
        System.out.println("      Terima Kasih Atas Kunjungan Anda   ");
        System.out.println("---------------------------------------\n");
    }
}