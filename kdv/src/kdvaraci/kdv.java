package kdvaraci;
import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        double kdvliTutar , kdvTutar , kdvOran = 0.18, tutar ;

        Scanner input = new Scanner(System.in);
        System.out.print("Ucret Tutarini Giriniz  : ");
        tutar = input.nextDouble();

        kdvTutar = tutar*kdvOran ;
        kdvliTutar = tutar+kdvTutar;
        kdvOran = (tutar * 0.18 ) ;

        System.out.println("Kdv'siz Tutar :"+tutar);
        System.out.println("Kdvli Tutar   :" +kdvliTutar);
        System.out.println("Kdv Tutari    :"+kdvTutar);
        System.out.println("Kdv Orani     :"+kdvOran);

    }
}
