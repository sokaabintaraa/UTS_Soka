public class Minuman extends Menu {
    private String type = "Minuman";

    public Minuman(String idMinuman, String namaMinuman, double harga) {
        super(idMinuman, namaMinuman, harga); 
    }

    @Override
    public void display() {
        System.out.println("Type     : " + this.type);
        System.out.println("ID Menu  : " + getIdMenu());
        System.out.println("Nama     : " + getNamaMenu()); // Cetak nama menu
        System.out.println("Harga    : Rp " + getHarga());
    }
}