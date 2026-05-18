public class Main {
    public static void main(String[] args) {
        // 1. Siapkan menu lengkap dengan Nama Produknya
        Menu kopi = new Minuman("110", "Es Kopi Susu", 12000.00); 
        Menu nasiGoreng = new Makanan("100", "Nasi Goreng Spesial", 18000.00); 

        // 2. Mulai transaksi baru
        Transaksi transaksi = new Transaksi("TRX-004");

        // 3. Tambahkan item belanjaan
        transaksi.addItem(kopi, 3);        // Beli 3 Es Kopi Susu
        transaksi.addItem(nasiGoreng, 2);  // Beli 2 Nasi Goreng

        // 4. Cetak output Struk Transaksi rapi
        System.out.println("========================================");
        System.out.println("            STRUK KASIR OOP             ");
        System.out.println("========================================");
        System.out.println("ID Transaksi: " + transaksi.getIdTransaksi());
        System.out.println("----------------------------------------");
        
        for (itemTransaksi item : transaksi.getListBelanjaan()) {
            // Mengambil nama menu langsung melalui directed association ke objek Menu
            System.out.println(item.getFinalMenu().getNamaMenu());
            System.out.println("  " + item.getQty() + " pcs x Rp " + item.getFinalMenu().getHarga() + " \t-> Rp " + item.getSubtotal());
            System.out.println("----------------------------------------");
        }
        
        System.out.println("TOTAL BELANJA: Rp " + transaksi.getTotalOmset());
        System.out.println("========================================");
    }
}