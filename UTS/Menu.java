public abstract class Menu {
    private String idMenu;
    private String namaMenu; // Tambahan properti baru
    private double harga;

    // Constructor sekarang menerima 3 parameter (ID, Nama, Harga)
    public Menu(String idMenu, String namaMenu, double harga) {
        this.idMenu = idMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    public abstract void display();

    // Getter untuk mengambil data nama
    public String getNamaMenu() {
        return this.namaMenu;
    }

    public double getHarga() {
        return this.harga;
    }

    public String getIdMenu() {
        return this.idMenu;
    }
}