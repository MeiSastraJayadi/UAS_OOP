import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader datain = new BufferedReader(new InputStreamReader(System.in));
        int someNum = 0, umur = 0, jamKerja = 0;
        Developer Dev = new Developer();
        String nama;
        char status;
        boolean menikah;
        System.out.println("========================================================");
        System.out.println("|           Aplikadi Menghitung Gajih Developer        |");
        System.out.println("========================================================");
        System.out.println("Pilih Role  ");
        System.out.println("   -----> 1. Backend Developer");
        System.out.println("   -----> 2. Frontend Developer");
        System.out.println("   -----> 3. Fullstack Developer");
        System.out.print("Masukkan pilihan : ");

        try {
            someNum = Integer.parseInt(datain.readLine());
            System.out.println("========================================================");
            System.out.println("|                     Form Data                        |");
            System.out.println("========================================================");
            System.out.print("Masukkan Nama : ");
            nama = datain.readLine();
            Dev.SetNama(nama);
            System.out.print("Masukkan Umur : ");
            umur = Integer.parseInt(datain.readLine());
            Dev.SetUmur(umur);
            System.out.print("Masukkan Jam Kerja : ");
            jamKerja = Integer.parseInt(datain.readLine());
            Dev.SetJamKerja(jamKerja);
            System.out.print("Apakah Sudah Menikah (y/t) : ");
            status = datain.readLine().charAt(0);
            if (status == 'y') {
                menikah = true;
            }
            else {
                menikah = false;
            }
            Dev.SetMenikah(menikah);
            System.out.println("===========================================================");

        } catch (IOException error) {
            System.out.println(error);
        }


        switch(someNum) {
            case 1 :
                Dev.SetGajihperJam(50000);
                Dev.SetTotalGajih();
                System.out.println("=========================================================");
                System.out.println("|                        Data Developer                 |");
                System.out.println("=========================================================");
                System.out.println("Nama : " + Dev.GetNama());
                System.out.println("Jabatan : Backend Developer");
                System.out.println("Umur : " + Dev.GetUmur());
                System.out.println("Jam Kerja : " + Dev.GetJamkerja());
                System.out.println("Lama Lembur (jam) : " + Dev.GetLembut());
                System.out.println("Sudah Menikah : " + (Dev.GetStatusMenikah() ? "Sudah" : "Belum"));
                System.out.println("Gaji per Jam : Rp. " + Dev.GetGajihperJam());
                System.out.println("Total Gajih : Rp. " + Dev.GetTotalGajih());
                break;
            case 2 :
                Dev.SetGajihperJam(40000);
                Dev.SetTotalGajih();
                System.out.println("=========================================================");
                System.out.println("|                        Data Developer                 |");
                System.out.println("=========================================================");
                System.out.println("Nama : " + Dev.GetNama());
                System.out.println("Jabatan : Frontend Developer");
                System.out.println("Umur : " + Dev.GetUmur());
                System.out.println("Jam Kerja : " + Dev.GetJamkerja());
                System.out.println("Lama Lembur (jam) : " + Dev.GetLembut());
                System.out.println("Sudah Menikah : " + (Dev.GetStatusMenikah() ? "Sudah" : "Belum"));
                System.out.println("Gaji per Jam : Rp. " + Dev.GetGajihperJam());
                System.out.println("Total Gajih : Rp. " + Dev.GetTotalGajih());
                break;
            case 3 :
                Dev.SetGajihperJam(55000);
                Dev.SetTotalGajih();
                System.out.println("=========================================================");
                System.out.println("|                        Data Developer                 |");
                System.out.println("=========================================================");
                System.out.println("Nama : " + Dev.GetNama());
                System.out.println("Jabatan : Fullstack Developer");
                System.out.println("Umur : " + Dev.GetUmur());
                System.out.println("Jam Kerja : " + Dev.GetJamkerja());
                System.out.println("Lama Lembur (jam) : " + Dev.GetLembut());
                System.out.println("Sudah Menikah : " + (Dev.GetStatusMenikah() ? "Sudah" : "Belum"));
                System.out.println("Gaji per Jam : Rp. " + Dev.GetGajihperJam());
                System.out.println("Total Gajih : Rp. " + Dev.GetTotalGajih());
                break;
            default :
                System.out.println("Pilihan role tidak tersedia");
        }
    }
}