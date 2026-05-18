public class itemTransaksi {
    private int qty;
    private Menu finalMenu; // Directed Association ke kelas Menu
    private double subtotal; // Menampung hasil perkalian harga * qty

    // Constructor menerima objek Menu dan jumlah beli (qty)
    public itemTransaksi(Menu finalMenu, int qty) {
        this.finalMenu = finalMenu;
        this.qty = qty;
        this.hitungSubtotalItem(); // Otomatis hitung subtotal saat item dibuat
    }

    // Mengisi variabel subtotal berdasarkan harga menu dikali qty
    private void hitungSubtotalItem() {
        this.subtotal = this.finalMenu.getHarga() * this.qty;
    }

    // Getter untuk mengambil nilai subtotal
    public double getSubtotal() {
        return this.subtotal;
    }

    // Getter lainnya untuk kebutuhan cetak struk
    public int getQty() { return qty; }
    public Menu getFinalMenu() { return finalMenu; }
}