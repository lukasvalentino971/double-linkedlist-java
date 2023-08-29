import java.util.Scanner;
public class DoubleLinkedListMain_13{
    public static void main(String[] args) throws Exception{

    Scanner Lukas = new Scanner(System.in);
    DoubleLinkedList_13 dll_Lukas = new DoubleLinkedList_13();
    int pilih = 0;

    System.out.println("====== QUIZ 2 PRAKTIKUM ASD TI - 1E  ======");
    System.out.println("dibuat oleh : Lukas Valentino");
    System.out.println("NIM : 2141720032");
    System.out.println("Absen : 13");

    do{
        System.out.println("====================================");
        System.out.println("MENU      ");
        System.out.println("====================================");
        System.out.println("1. Tambah Antrian"); // input class pembeli
        System.out.println("2. Cetak Antrian"); // clas pembeli
        System.out.println("3. Hapus Antrian"); // hapus antrian pertama dan input class pesanan
        System.out.println("4. Laporan Pengurutan pesanan by nama ");
        System.out.println("5. Hitung Total Pendapatan");
        System.out.println("6. Keluar");
        System.out.print("Pilih (1-5): ");
        pilih = Lukas.nextInt();
        System.out.println("");


        switch (pilih) {
            case 1:
                System.out.println("-----------------------------");
                System.out.println("Masukkan Data Pembeli ");
                System.out.println("-----------------------------");

                System.out.print("Nomor Antrian : ");
                int no_antri = Lukas.nextInt();
                System.out.print("Nama Customer : ");
                String nama_cust = Lukas.next();
                System.out.print("Nomor HP : ");
                String no_hp = Lukas.next();

                Pembeli_13 p1 = new Pembeli_13(nama_cust, no_hp);
                Pembeli_13 p2 = new Pembeli_13("Abyzaz" , "0822451111111");
                Pembeli_13 p3 = new Pembeli_13("Yoshiyonya" , "082245222222");
                Pembeli_13 p4 = new Pembeli_13("Susi" , "081234456");



                dll_Lukas.addLast(p1);
                dll_Lukas.addLast(p2);
                dll_Lukas.addLast(p3);
                dll_Lukas.addLast(p4);
                break;
            case 2:
                dll_Lukas.print();
                break ;
            case 3:
                dll_Lukas.removeFirst();
                System.out.println("-----------------------------");
                System.out.println("Transaksi Input Pesanan ");
                System.out.println("-----------------------------");

                System.out.print("Nomor Pesanan : ");
                int no_pesan = Lukas.nextInt();
                System.out.print("Nama Pesanan  : ");
                String nama_pesan = Lukas.next();
                System.out.print("Harga : ");
                int harga = Lukas.nextInt();

                Pesanan_13 pes1 = new Pesanan_13(no_pesan, nama_pesan, harga);
                Pesanan_13 pes2 = new Pesanan_13(2, "Mie_goreng", 15000);
                Pesanan_13 pes3 = new Pesanan_13(3, "Soto", 15000);
                Pesanan_13 pes4 = new Pesanan_13(4, "Bulgogi", 25000);

                dll_Lukas.addLastPesanan(pes1);
                dll_Lukas.addLastPesanan(pes2);
                dll_Lukas.addLastPesanan(pes3);
                dll_Lukas.addLastPesanan(pes4);



                break;
            case 4:
            //sort
            break;

            case 5:
            

                

        
            default:
                break;
        }




        }while(pilih != 7);
    }


}