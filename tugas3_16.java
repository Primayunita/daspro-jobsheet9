import java.util.Scanner;

public class tugas3_16 {
    public static void main(String[] args) {
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                         "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.println("Menu Makanan/Minuman di Kafe:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nMasukkan nama makanan/minuman yang ingin dicari: ");
        String makananDicari = scanner.nextLine();

        int posisiDitemukan = -1;
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) {
                posisiDitemukan = i;
                break;
            }
        }

        if (posisiDitemukan != -1) {
            System.out.println("Makanan/Minuman \"" + makananDicari + "\" tersedia di menu pada posisi ke-" + (posisiDitemukan + 1) + ".");
        } else {
            System.out.println("Makanan/Minuman \"" + makananDicari + "\" tidak tersedia di menu.");
        }
    }
} 