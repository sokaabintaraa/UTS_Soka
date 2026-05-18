public class Makanan extends Menu {
    private String type = "Makanan";

    public Makanan(String idMakanan, String namaMakanan, double harga) {
        super(idMakanan, namaMakanan, harga); 
    }

    @Override
    public void display() {
        System.out.println("Type     : " + this.type);
        System.out.println("ID Menu  : " + getIdMenu());
        System.out.println("Nama     : " + getNamaMenu()); // Cetak nama menu
        System.out.println("Harga    : Rp " + getHarga());
    }
}