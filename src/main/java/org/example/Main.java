import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //input data diri
        System.out.println("Nama: ");
        String nama = scan.nextLine();

        System.out.println("Jenis kelamin (L/P): ");
        char jenisKelamin = scan.next().charAt(0);

        System.out.println("Tanghgal lahir (format: yyyy-MM-dd): ");
        String tanggalLahirString = scan.next();

        //konversi tanggal ke LocalDate
        LocalDate tanggaLahir = LocalDate.parse(tanggalLahirString, DateTimeFormatter.ISO_DATE);

        //menghitung umur dan bulan berdasarkan tanggalLahir
        LocalDate now = LocalDate.now();
        Period periode = Period.between(tanggaLahir,now);
        int umurTahun = periode.getYears();
        int umurBulan = periode.getMonths();

        //output
        String jenisKelaminLengkap = (jenisKelamin == 'L' || jenisKelamin == 'P') ? "Laki-laki" : "Perempuan";
        System.out.println("\nDate Diri: ");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Umur anda: " + umurTahun + "tahun" + umurBulan + "bulan");

    }
}