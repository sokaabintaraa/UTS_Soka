public class Pembayaran {
    // Encapsulation: Melindungi data agar aman
    private Transaksi dataTransaksi;
    private double uangDibayar;
    private double uangKembalian;

    public Pembayaran(Transaksi dataTransaksi) {
        this.dataTransaksi = dataTransaksi;
    }

    // Memproses pembayaran pelanggan
    public void prosesPembayaran(double uangDibayar) {
        this.uangDibayar = uangDibayar;
        
        // SOLUSI: Menggunakan getTotalOmset() sesuai yang ada di Transaksi.java
        double totalTagihan = dataTransaksi.getTotalOmset(); 

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
        
        // SOLUSI: Tipe data harus 'itemTransaksi', bukan 'Menu'
        for (itemTransaksi item : dataTransaksi.getListBelanjaan()) {
            
            // Mengambil data menu dari dalam objek itemTransaksi (Directed Association)
            System.out.println("Nama Menu    : " + item.getFinalMenu().getNamaMenu());
            System.out.println("Harga Satuan : Rp " + item.getFinalMenu().getHarga());
            System.out.println("Jumlah (Qty) : " + item.getQty() + " pcs");
            
            // SOLUSI: Mengambil nilai subtotal dari properti itemTransaksi, bukan dari Menu
            System.out.println("Subtotal     : Rp " + item.getSubtotal());
            System.out.println("---------------------------------------");
        }

        // SOLUSI: Menggunakan getTotalOmset()
        System.out.println("Total Tagihan: Rp " + dataTransaksi.getTotalOmset());
        System.out.println("Uang Tunai   : Rp " + this.uangDibayar);
        System.out.println("Kembalian    : Rp " + this.uangKembalian);
        System.out.println("---------------------------------------");
        System.out.println("      Terima Kasih Atas Kunjungan Anda   ");
        System.out.println("---------------------------------------\n");
    }
}