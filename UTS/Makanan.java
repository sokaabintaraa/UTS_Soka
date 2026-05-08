class Makanan extends Menu {

    String type = "Makanan";

    Makanan(String idMakanan, int inputJumlah, double outputHarga){
        super(idMakanan, inputJumlah, outputHarga);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type : " + this.type);
        System.out.println("ID ini " + this.idMenu + " Dengan Jumlah " + this.menuJumlah + " dikenakan harga " + Harga);
    }
    
}
