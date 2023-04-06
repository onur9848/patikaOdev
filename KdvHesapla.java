import java.util.Scanner;

public class KdvHesapla {
    public static void main(String[] args) {
        double tutar,kdvOrani;

        Scanner scanner= new Scanner(System.in);
        System.out.print("Ürün tutarını giriniz: ");
        tutar = scanner.nextDouble();
        kdvOrani =(tutar>1000)?1.08:1.18;
        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV'li tutar: " + (tutar*kdvOrani));
        System.out.println("KDV tutarı: " + (tutar*kdvOrani-tutar));
    }
}
