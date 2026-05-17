class Makanan extends Menu {
    private String type = "Makanan";

    public Makanan(String idMakanan, int inputJumlah, double outputHarga) {
        super(idMakanan, inputJumlah, outputHarga);
    }

    // Mengimplementasikan method abstract dari induk
    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public double hitungSubtotal() {
        // Rumus matematika subtotal: $subtotal = jumlah \times harga$
        return getMenuJumlah() * getHarga();
    }

    @Override
    public void display() {
        super.display(); // Memanggil display() milik kelas Menu
        System.out.println("Type   : " + this.type);
        System.out.println("ID ini " + getIdMenu() + " Dengan Jumlah " + getMenuJumlah() + " dikenakan harga " + getHarga());
        System.out.println("Subtotal: Rp " + hitungSubtotal());
        System.out.println("----------------------------------------");
    }
}