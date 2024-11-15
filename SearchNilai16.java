import java.util.Scanner;
public class SearchNilai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();

        int[] arrNilai = new int[jumlahSiswa];
        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();
        
        int hasil = -1; 
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i; 
                break;
            }
        }
        if (hasil != -1) {
            System.out.println("Nilai " + key + " ditemukan di indeks ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan.");
        }
        System.out.println();
    }
}