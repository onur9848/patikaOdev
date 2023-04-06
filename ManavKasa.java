import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armutFiyat = 2.14,
                elmaFiyat = 3.67,
                domatesFiyat = 1.11,
                muzFiyat = 0.95,
                patlicanFiyat = 5.00;
        int armutkg, elmakg, domateskg, muzkg, patlicankg;
        double tutar = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut kaç kilo?: ");
        armutkg = scanner.nextInt();
        tutar += armutkg * armutFiyat;

        System.out.print("Elma kaç kilo?: ");
        elmakg = scanner.nextInt();
        tutar += elmakg * elmaFiyat;

        System.out.print("Domates kaç kilo?: ");
        domateskg = scanner.nextInt();
        tutar += domateskg * domatesFiyat;

        System.out.print("Muz kaç kilo?: ");
        muzkg = scanner.nextInt();
        tutar += muzkg * muzFiyat;

        System.out.print("Patlıcan kaç kilo?: ");
        patlicankg = scanner.nextInt();
        tutar += patlicankg * patlicanFiyat;

        System.out.println("Toplam tutar: "+tutar);

    }
}
