import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = scanner.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = scanner.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = scanner.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = scanner.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = scanner.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = scanner.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamanız: "+sonuc);
        String durum = (sonuc>60)?"Sınıfı geçti":"Sınıfta kaldı";
        System.out.println(durum);

    }
}
