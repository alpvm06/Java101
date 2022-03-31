import java.util.Scanner;

public class Endeks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double boy,kilo,indeks;

        System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz : ");
        boy = scan.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz : ");
        kilo = scan.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.println("Vucut Kitle Indeksiniz : " + indeks);
    }
}
