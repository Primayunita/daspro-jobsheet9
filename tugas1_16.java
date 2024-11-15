import java.util.Scanner;

public class tugas1_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlahNilai = scanner.nextInt();

        int[] nilaiMahasiswa = new int[jumlahNilai];

        System.out.println("Masukkan nilai mahasiswa:");
        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        int totalNilai = 0;
        for (int nilai : nilaiMahasiswa) {
            totalNilai += nilai;
        }
        double rataRata = (double) totalNilai / jumlahNilai;

        int nilaiTertinggi = nilaiMahasiswa[0];
        int nilaiTerendah = nilaiMahasiswa[0];
        
        for (int nilai : nilaiMahasiswa) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        System.out.println("\nNilai mahasiswa yang telah dimasukkan:");
        for (int nilai : nilaiMahasiswa) {
            System.out.print(nilai + " ");
        }

        System.out.println("\n\nHasil:");
        System.out.println("Nilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);

    }
}
    

