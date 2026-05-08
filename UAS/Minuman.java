class Minuman extends Menu {

    String type = "Makanan";

    Minuman(String idMinuman, int inputJumlah, double outputHarga){
        super(idMinuman, inputJumlah, outputHarga);
    }

    @Override
    void display(){
        super.display();
        System.out.println("Type : " + this.type);
        System.out.println("ID ini " + this.idMenu + " Dengan Jumlah " + this.menuJumlah + "dikenakan harga " + Harga);
    }
    
}
