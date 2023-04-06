import java.util.Scanner;

public class DaireAlani {
    public static void main(String[] args) {
        int r, a;
        double pi =3.14,sonuc;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dairenin yarıçapı: ");
        r = scanner.nextInt();
        System.out.print("Dairenin merkez açı ölçüsü: ");
        a = scanner.nextInt();

        sonuc = (pi*(r*r)*a)/360;
        System.out.println("Daire diliminin alanı: "+sonuc);


    }
}
