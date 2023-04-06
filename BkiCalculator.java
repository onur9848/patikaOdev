import java.util.Scanner;

public class BkiCalculator {
    public static void main(String[] args) {
        double boy, bki;
        int kilo;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = scanner.nextInt();

        bki = kilo/(boy*boy);

        System.out.println("Vücut kitle İndeksiniz: "+bki);


    }
}
