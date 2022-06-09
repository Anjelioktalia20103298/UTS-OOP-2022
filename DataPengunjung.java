package datapengunjung;

import java.util.Scanner;

/**
 *
 * @author Anjeli Oktalia_20103298
 */
public class DataPengunjung {
    String isi;
    DataPengunjung next;
    public static Scanner in=new Scanner(System.in);
    public static Scanner str=new Scanner(System.in);
    public static void main(String[] args) {
        int menu=0;
        Data dt=new Data();
        while(menu!=3){
            System.out.println("Selamat Datang Di Sistem Informasi Data Pengunjung Kebun Binatang");
            System.out.println("Silahkan Pilih Menu Berikut : ");
            System.out.println("1. Tampilkan Pengunjung ");
            System.out.println("2. Isi Data Pengunjung ");
            System.out.println("3. Keluar ");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Pilihan Menu : ");
            menu=in.nextInt();
            switch (menu) {
                case 1 -> dt.view();
                case 2 -> {
                    DataPengunjung baru=new DataPengunjung();
                    baru.input();
                    dt.push(baru);
                }
                case 3 -> System.out.println("Sampai Jumpa :)");
                default -> System.out.println("Pilihan Menu Salah, Silahkan Pilih Menu 1,2 atau 3");
            }
            System.out.println(" ");
        }
    }   
    public void input(){
        System.out.print("Masukkan Nama Pengunjung : ");
        isi=str.nextLine();
        System.out.println("Data "+isi+" berhasil ditambahkan");
        System.out.println("Silahkan Pilih Menu Kembali");
        next=null;
    }
    public void view(){
        System.out.println("Nama Pengunjung : "+isi);
    }    
}
