import java.util.Scanner;

public class Percobaan2 {

    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            System.out.print("1");
            return 1;
        } else {
            System.out.print(x + (y > 1 ? "x" : "x1 = "));
            return x * hitungPangkat(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();

        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();

        System.out.print("Proses perhitungan: ");
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(hasil);
    }
}