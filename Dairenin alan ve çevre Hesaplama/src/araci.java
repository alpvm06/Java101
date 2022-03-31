import java.util.Scanner;

public class araci {
    public static void main(String[] args) {
int r;
double pi = 3.14;
Scanner imp = new Scanner(System.in);
System.out.print("Dairenin yari capini giriniz : ");
r = imp.nextInt();
double alan = pi * r * r;
double cevre = 2 * pi * r;

System.out.println("Dairenin Alani : " + alan);
System.out.println("Dairenin Cevresi : " + cevre);
}
    }

