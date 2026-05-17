
abstract class Menu {
    private String idMenu;
    private int menuJumlah;
    private double harga;

    // Constructor
    public Menu(String idMenu, int menuJumlah, double harga) {
        this.idMenu = idMenu;
        this.menuJumlah = menuJumlah;
        this.harga = harga;
    }

    // Encapsulation: Getter dan Setter untuk mengakses variabel private
    public String getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(String idMenu) {
        this.idMenu = idMenu;
    }

    public int getMenuJumlah() {
        return menuJumlah;
    }

    public void setMenuJumlah(int menuJumlah) {
        if (menuJumlah >= 0) { // Validasi sederhana
            this.menuJumlah = menuJumlah;
        }
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga >= 0) {
            this.harga = harga;
        }
    }

    public void display() {
        System.out.println("ID     : " + idMenu);
        System.out.println("Jumlah : " + menuJumlah);
        System.out.println("Harga  : Rp " + harga);
    }

    // Abstraction: Method abstract yang wajib didefinisikan secara spesifik oleh kelas anak
    public abstract String getType();
    public abstract double hitungSubtotal();
}