class Menu {

    String idMenu;
    int menuJumlah;
    double Harga;

    Menu(String idMenu, int menuJumlah, double Harga){
        this.idMenu = idMenu;
        this.menuJumlah = menuJumlah;
        this.Harga = Harga;
    }

        void display(){
            System.out.println("ID : " + idMenu);
            System.out.println("Jumlah : " + menuJumlah);
            System.out.println("Harga : " + Harga);
        }
}