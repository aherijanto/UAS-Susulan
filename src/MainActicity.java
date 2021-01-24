import javax.swing.text.html.ListView;
import java.util.Scanner;

public class MainActicity {
    public static void main(String[] args) {
        Library.PrintHeader();
        System.out.print("\n");

        Scanner sc = new Scanner(System.in);
        System.out.print("Nana Pelanggan = ");
        String namaPelanggan = sc.next();
        System.out.print("No Meja = ");
        String noMeja = sc.next();
        System.out.println("");
        System.out.print("Input Jumlah Pesanan = ");
        int jumlahPesanan = sc.nextInt();
        System.out.println("");
        Library.ShowMenu();

        String[] pesananPelanggan = new String[jumlahPesanan];
        int noUrut = 0;
        for(int index=0; index< pesananPelanggan.length;index++){
            noUrut++;
            System.out.print("Input Pesanan " + noUrut +" = ");
            int noIndexPesanan = sc.nextInt();
            switch (noIndexPesanan){
                case 1 :
                    pesananPelanggan[index] = "Nasi Putih";
                    break;
                case 2:
                    pesananPelanggan[index] = "Ayam Bakar";
                case 3 :
                    pesananPelanggan[index] = "Ayan Goreng";
                    break;
                case 4 :
                    pesananPelanggan[index] = "Nasi Lengko";
                    break;
                case 5 :
                    pesananPelanggan[index] = "Es Teh Manis";
                    break;

            }
        }
        System.out.println("");
        System.out.println("Pesanan Pelanggan = " + namaPelanggan);
        System.out.println("No Meja = " + noMeja);
        System.out.println("PESANAN ANDA ADALAH");
        System.out.println("--------------------------------------");
        Library.PrintPesanan(pesananPelanggan);
        System.out.println("--------------------------------------");

    }
}
