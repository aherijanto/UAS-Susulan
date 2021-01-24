public class Library {
    public static void PrintHeader(){
        String Judul;
        String Nama;
        String NIM;

        Judul = "UAS Susulan\n";
        Judul += "KELAS 1D\n";
        Judul += "POLTEK HARBER";

        Nama = "NAMA ANDA SENDIRI";
        NIM = "8421xxx";

        System.out.println(Judul);
        System.out.println("Nama Lengkap = "+ Nama);
        System.out.println("No Induk = " + NIM);
    }

    public static void ShowMenu(){
        String foodMenu;
        foodMenu =  "Menu Makanan\n";
        foodMenu += "---------------------\n";
        foodMenu +=  "1. Nasi Putih\n";
        foodMenu += "2. Ayam Bakar\n";
        foodMenu += "3. Ayam Goreng\n";
        foodMenu += "4. Nasi Lengko\n";
        foodMenu += "5. Es Teh Manis\n";

        System.out.println(foodMenu);
    }

    public static void PrintPesanan(String[] PesananMakanan){
        for(int index = 0; index<PesananMakanan.length; index++){
            System.out.println(PesananMakanan[index]);
        }
    }


}
