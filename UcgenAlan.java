import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        int a, b, c, temp;
        double alan;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Kenarı giriniz: ");
        a = scanner.nextInt();
        System.out.print("2. Kenarı giriniz: ");
        b = scanner.nextInt();
        System.out.print("3. Kenarı giriniz: ");
        c = scanner.nextInt();
        temp = a+b+c;
        temp = temp/2;
        alan = Math.sqrt(temp*(temp-a)*(temp-b)*(temp-c));
        System.out.println("Ucgenin Alanı: "+alan);


    }
}
